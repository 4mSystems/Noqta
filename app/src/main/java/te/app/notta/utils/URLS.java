package te.app.notta.utils;

public class URLS {
    public final static String BASE_URL = "http://noqta-learn.com/api/";
    // post
    public final static String SPECIALIST = "teacher/get-specialists";
    public final static String ADD_GROUP = "teacher/create-group";
    public final static String HOME = "teacher/get-my-groups";
    public final static String INVITE_STUDENTS = "teacher/search-students?search_key=";
    public final static String SEND_INVITATIONS = "teacher/invite-students";
    public final static String DELETE_POST = "v1/post/";
    public final static String DELETE_QUESTIONED_POST = "v1/question_request?post_id=";

    public final static String SERVICES = "services";
    public final static String LOGIN_SOCIAL = "v1/social_register";
    public final static String LOGIN_PASSWORD = "user/login";
    public final static String REGISTER = "user/register";
    public final static String COUNTRIES = "v1/countries";
    public final static String CITIES = "v1/cities?governorate_id=";
    public final static String BOARD = "app/app-explanation";
    public final static String CONFIRM_CODE = "user/otp-check";
    public final static String UPDATE_PROFILE = "v1/provider/profile";
    public static final String FORGET_PASSWORD = "user/verify-email";
    public static final String CHANGE_PASSWORD = "v1/provider/change_password";
    public final static String GET_CONTACT = "v1/contact_us";
    public final static String SEARCH_POSTS = "v1/search?type=";
    public final static String CHANGE_STATUS = "v1/provider/order/update_status";
    public final static String REJECT_ORDER = "v1/provider/order/reject";
    public final static String MY_CURRENT_ORDERS = "v1/provider/orders/current?page=";
    public final static String MY_LAST_ORDERS = "v1/provider/orders/latest?page=";
    public final static String HIDE_POST = "v1/hide/post";
    public final static String SHARE_POST = "v1/share/post?page=";
    public final static String POST_DETAILS = "v1/provider/order/";
    public final static String WALLET_HISTORY = "v1/provider/wallet";
    public static final String GET_SERVICES = "v1/provider/main_services";
    public final static String CREATE_LIVE = "v1/live_stream";
    public final static String LIVE_DETAILS = "v1/live_stream/details/";
    public static final String CONTACT_US = "v1/contact_us";
    public static final String NOTIFICATIONS = "v1/provider/notifications?page=";
    public final static String GET_USER_DOCUMENTS = "delegate/delegate-documents";
    public final static String USER_PROFILE = "v1/provider/profile";
    public static final String GET_SOCIAL = "v1/social_media";
    public static final String PRIVACY = "v1/privacy_policy";
    public static final String REPORT_REASONS = "v1/report_reasons";
    public static final String CHANGE_PROFILE_PASSWORD = "v1/provider/profile/password";
    public static final String BAN_USER = "v1/profile/ban";
    public static final String ABOUT = "v1/about_us";
    public static final String TERMS = "v1/terms_condition";
    public final static String REPORT_USER = "v1/profile/report";
    public final static String SEE_FIRST = "v1/follow/see_first";

}
