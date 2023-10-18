import java.util.*;

class PythagoreanTriplet  {

    int a;
    int b;
    int c;
    PythagoreanTriplet(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String toString() {
        return String.format("(%d, %d, %d)", a, b, c);
    }
    public boolean equals(Object o) {
        if ( this == o ) {
            return true;
        } else if ( o instanceof PythagoreanTriplet ) {
            PythagoreanTriplet pt = (PythagoreanTriplet) o;
            return a == pt.a && b == pt.b && c == pt.c;
        } else {
            return false;
        }
    }

    static TripletListBuilder makeTripletsList() {
        return new TripletListBuilder();
    }

    static class TripletListBuilder {

        int sum;
        Integer maxFactor = null;

        static final double PERIMETER_RATIO_LIMIT = 1 + 1 + Math.sqrt(2);
        TripletListBuilder thatSumTo(int sum) {
            this.sum = sum;
            if ( maxFactor == null ) {
                maxFactor = sum;
            }
            return this;
        }

        TripletListBuilder withFactorsLessThanOrEqualTo(int maxFactor) {
            this.maxFactor = maxFactor;
            return this;
        }

        
        //    a² + (b + c)²
        //    ------------- = c
        //      2(b + c)
        //
        //
        //    a² + (n - a)²
        //    ------------- = c
        //      2(n - a)

        List<PythagoreanTriplet> build() {
            List<PythagoreanTriplet> triplets = new ArrayList<>();
            for (int a = 1; a <= Math.floor(sum / PERIMETER_RATIO_LIMIT); a++) {
                int numerator = a * a + (int) Math.pow(sum-a, 2);
                int denominator = 2 * (sum - a);
                if ( numerator % denominator == 0 ) {
                    int c = numerator / denominator;
                    if ( c <= maxFactor ) {
                        int b = sum - a - c;
                        triplets.add(new PythagoreanTriplet(a, b, c));
                    }
                }
            }
            return triplets;
        }

    }

}

