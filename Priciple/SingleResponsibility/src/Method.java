public class Method {
    private void updateUserInfo(String userName, String address) {
        userName = "dell";
        address = "beijing";
    }

    private void updateUserInfo(String userName, String... properties) {
        userName = "dell";
    }

    private void updateUsername(String userName) {
        userName = "dell";
    }

    private void updateUserAddress(String address) {
        address = "beijing";
    }

    private void updateUserInfo(String userName, String address, boolean bool) {
        if (bool) {
            //todo something1
        } else {
            //todo something2
        }
        userName = "dell";
        address = "beijing";
    }
}