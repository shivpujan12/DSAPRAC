public class UtfValidation {

    public boolean validUtf8(int[] data) {

        int i = 0;
        boolean flag = false;
        while (i < data.length) {

            String bin = getBinary(data[i]);

            //check the first string
            if (bin.charAt(0) == '0' && (data.length - i) > 1) {
                flag= true;
                i++;
            } else if (bin.startsWith("110")) {
                if ((data.length - i) > 1 &&
                        getBinary(data[i + 1]).startsWith("10")) {
                    flag = true;
                    i = i + 2;
                } else {
                    return false;
                }
            } else if (bin.startsWith("1110")) {
                if ((data.length - i) > 2
                        && getBinary(data[i + 1]).startsWith("10")
                        && getBinary(data[i + 2]).startsWith("10")
                ) {
                    flag = true;
                    i = i + 3;
                } else {
                    return false;
                }
            } else if (bin.startsWith("11110")) {
                if ((data.length - i) > 3
                        && getBinary(data[i + 1]).startsWith("10")
                        && getBinary(data[i + 2]).startsWith("10")
                        && getBinary(data[i + 3]).startsWith("10")
                ) {
                    flag = true;
                    i = i + 4;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        return flag;
    }

    public String getBinary(int i) {
        StringBuilder bin = new StringBuilder(Integer.toBinaryString(i));

        //convert to length of 8 bits
        if (bin.length() != 8) {
            while (bin.length() < 8) {
                bin.insert(0, "0");
            }
        }
        return bin.toString();
    }

    public void unitTest() {
        int[] nums = {39,89,227,83,132,95,10,0};

        for (int num : nums) {
            StringBuilder bin = new StringBuilder(Integer.toBinaryString(num));
            if (bin.length() != 8) {
                while (bin.length() < 8) {
                    bin.insert(0, "0");
                }
            }
            System.out.println(bin);
        }

        System.out.println(validUtf8(nums));

    }

}
