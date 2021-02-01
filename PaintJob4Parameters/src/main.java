public class main {
    public static void main(String[] args) {
        System.out.println(getBucketCount(0.75, 0.75, 0.5, 0));
    }
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }
        double wallArea = width * height;
        System.out.println("wall area "+wallArea);
        double areaCovered = extraBuckets * areaPerBucket;
        System.out.println("area covered "+ areaCovered);
        return (int) Math.ceil((wallArea - areaCovered)/areaPerBucket) ;
    }
    public static int getBucketCount(double width, double height, double areaPerBucket){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0){
            return -1;
        }
        double wallArea = width * height;
        int BucketsNeeded = (int)Math.ceil((wallArea/areaPerBucket));
        return BucketsNeeded;
    }
    public static int getBucketCount(double area, double areaPerBucket){
        if(area <= 0 || areaPerBucket <= 0){
            return -1;
        }
        int BucketsNeeded = (int)Math.ceil((area/areaPerBucket));
        return BucketsNeeded;
    }
}
