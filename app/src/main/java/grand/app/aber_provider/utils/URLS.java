package grand.app.aber_provider.utils;

public class URLS {
    public final static String BASE_URL = "https://aber.my-staff.net/api/";
    // post
    public final static String PACKAGES = "v1/provider/packages";
    public final static String SUBSCRIBE = "v1/provider/package";
    public final static String CREATE_POST = "v1/post";
    public final static String ASK_USER = "v1/ask/post";
    public final static String EDIT_POST = "v1/post/";
    public final static String DELETE_POST = "v1/post/";
    public final static String DELETE_QUESTIONED_POST = "v1/question_request?post_id=";

    public final static String SERVICES = "services";
    public final static String LOGIN_SOCIAL = "v1/social_register";
    public final static String LOGIN_PASSWORD = "v1/provider/login";
    public final static String REGISTER = "v1/register";
    public final static String COUNTRIES = "v1/countries";
    public final static String CITIES = "v1/cities?governorate_id=";
    public final static String BOARD = "v1/provider/welcome";
    public final static String CONFIRM_CODE = "v1/code_check";
    public final static String UPDATE_PROFILE = "v1/profile";
    public static final String FORGET_PASSWORD = "v1/code_send";
    public static final String CHANGE_PASSWORD = "v1/change_password";
    public static final String FOLLOWERS_POSTS = "v1/following/posts?page=";
    public final static String SEARCH_POSTS = "v1/search?type=";
    public final static String REACT_POST = "v1/react/post";
    public final static String MAKE_COMMENT = "v1/comment";
    public final static String DELETE_COMMENT = "v1/comment/";
    public final static String EDIT_COMMENT = "v1/comment/";
    public final static String HIDE_POST = "v1/hide/post";
    public final static String SHARE_POST = "v1/share/post?page=";
    public final static String POST_DETAILS = "v1/post/";
    public final static String COMMENT_REPLIES = "v1/comment/replies?comment_id=";
    public static final String POST_REACTS = "v1/reacts?post_id=";
    public final static String CREATE_LIVE = "v1/live_stream";
    public final static String LIVE_DETAILS = "v1/live_stream/details/";
    public static final String CONTACT_US = "v1/contact_us";
    public static final String NOTIFICATIONS = "v1/notifications?page=";
    public final static String GET_USER_DOCUMENTS = "delegate/delegate-documents";
    public final static String USER_PROFILE = "v1/profile?user_id=";
    public final static String SHARED_POSTS = "v1/profile/shared/posts?user_id=";
    public static final String COMMENTED_POSTS = "v1/profile/commented/posts?user_id=";
    public static final String QUESTIONED_POSTS = "v1/profile/questioned/posts?user_id=";
    public static final String NOT_ANSWERED_QUESTIONED_POSTS = "v1/question_request/post?page=";
    public static final String USER_FOLLOWERS = "v1/followers?user_id=";
    public static final String CHANGE_FOLLOW_ACTIONS = "v1/unfollow";
    public static final String STORE_FOLLOW = "v1/follow";
    public static final String REPORT_REASONS = "v1/report_reasons";
    public static final String CHANGE_PROFILE_PASSWORD = "v1/profile/password";
    public static final String BAN_USER = "v1/profile/ban";
    public static final String ABOUT = "v1/about_us";
    public static final String TERMS = "v1/terms_condition";
    public final static String USER_FOLLOWING = "v1/followings?user_id=";
    public final static String REPORT_USER = "v1/profile/report";
    public final static String SEE_FIRST = "v1/follow/see_first";

}
