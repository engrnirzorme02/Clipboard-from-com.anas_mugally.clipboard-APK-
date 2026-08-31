package p192Z3;

import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: Z3.o */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2137o {
    /* JADX INFO: renamed from: a */
    public static Status m8742a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return new Status(17499);
        }
        String[] strArrSplit = str.split(":", 2);
        strArrSplit[0] = strArrSplit[0].trim();
        if (strArrSplit.length > 1 && (str2 = strArrSplit[1]) != null) {
            strArrSplit[1] = str2.trim();
        }
        List listAsList = Arrays.asList(strArrSplit);
        return listAsList.size() > 1 ? m8743b((String) listAsList.get(0), (String) listAsList.get(1)) : m8743b((String) listAsList.get(0), null);
    }

    /* JADX INFO: renamed from: b */
    private static Status m8743b(String str, String str2) {
        int i7;
        str.getClass();
        switch (str) {
            case "USER_CANCELLED":
                i7 = 18001;
                break;
            case "INVALID_RECIPIENT_EMAIL":
                i7 = 17033;
                break;
            case "WEB_CONTEXT_ALREADY_PRESENTED":
                i7 = 17057;
                break;
            case "INTERNAL_SUCCESS_SIGN_OUT":
                i7 = 17091;
                break;
            case "INVALID_IDP_RESPONSE":
            case "INVALID_LOGIN_CREDENTIALS":
            case "INVALID_PENDING_TOKEN":
                i7 = 17004;
                break;
            case "DYNAMIC_LINK_NOT_ACTIVATED":
                i7 = 17068;
                break;
            case "QUOTA_EXCEEDED":
                i7 = 17052;
                break;
            case "WEB_NETWORK_REQUEST_FAILED":
                i7 = 17061;
                break;
            case "INVALID_RECAPTCHA_VERSION":
                i7 = 17206;
                break;
            case "RECAPTCHA_NOT_ENABLED":
                i7 = 17200;
                break;
            case "EXPIRED_OOB_CODE":
                i7 = 17029;
                break;
            case "UNAUTHORIZED_DOMAIN":
                i7 = 17038;
                break;
            case "INVALID_OOB_CODE":
                i7 = 17030;
                break;
            case "MISSING_EMAIL":
                i7 = 17034;
                break;
            case "INVALID_CODE":
                i7 = 17044;
                break;
            case "INVALID_HOSTING_LINK_DOMAIN":
                i7 = 17214;
                break;
            case "TOKEN_EXPIRED":
                i7 = 17021;
                break;
            case "INVALID_TENANT_ID":
                i7 = 17079;
                break;
            case "ALTERNATE_CLIENT_IDENTIFIER_REQUIRED":
                i7 = 18002;
                break;
            case "INVALID_SESSION_INFO":
                i7 = 17046;
                break;
            case "SECOND_FACTOR_EXISTS":
                i7 = 17087;
                break;
            case "INVALID_EMAIL":
            case "INVALID_IDENTIFIER":
                i7 = 17008;
                break;
            case "ADMIN_ONLY_OPERATION":
                i7 = 17085;
                break;
            case "MISSING_OR_INVALID_NONCE":
                i7 = 17094;
                break;
            case "INVALID_CERT_HASH":
                i7 = 17064;
                break;
            case "NO_SUCH_PROVIDER":
                i7 = 17016;
                break;
            case "MFA_ENROLLMENT_NOT_FOUND":
                i7 = 17084;
                break;
            case "MISSING_PASSWORD":
                i7 = 17035;
                break;
            case "CREDENTIAL_TOO_OLD_LOGIN_AGAIN":
                i7 = 17014;
                break;
            case "TIMEOUT":
            case "<<Network Error>>":
                i7 = 17020;
                break;
            case "INVALID_REQ_TYPE":
                i7 = 17207;
                break;
            case "INVALID_RECAPTCHA_ACTION":
                i7 = 17203;
                break;
            case "OPERATION_NOT_ALLOWED":
            case "PASSWORD_LOGIN_DISABLED":
                i7 = 17006;
                break;
            case "WEB_INTERNAL_ERROR":
                i7 = 17062;
                break;
            case "SECOND_FACTOR_LIMIT_EXCEEDED":
                i7 = 17088;
                break;
            case "MISSING_MFA_ENROLLMENT_ID":
                i7 = 17082;
                break;
            case "USER_NOT_FOUND":
            case "EMAIL_NOT_FOUND":
                i7 = 17011;
                break;
            case "CAPTCHA_CHECK_FAILED":
                i7 = 17056;
                break;
            case "WEAK_PASSWORD":
                i7 = 17026;
                break;
            case "UNSUPPORTED_FIRST_FACTOR":
                i7 = 17089;
                break;
            case "INVALID_SENDER":
                i7 = 17032;
                break;
            case "MISSING_PHONE_NUMBER":
                i7 = 17041;
                break;
            case "INVALID_DYNAMIC_LINK_DOMAIN":
                i7 = 17074;
                break;
            case "MISSING_MFA_PENDING_CREDENTIAL":
                i7 = 17081;
                break;
            case "UNSUPPORTED_PASSTHROUGH_OPERATION":
                i7 = 17095;
                break;
            case "EMAIL_EXISTS":
                i7 = 17007;
                break;
            case "INVALID_ID_TOKEN":
                i7 = 17017;
                break;
            case "WEB_STORAGE_UNSUPPORTED":
                i7 = 17065;
                break;
            case "MISSING_CLIENT_TYPE":
                i7 = 17204;
                break;
            case "MISSING_RECAPTCHA_VERSION":
                i7 = 17205;
                break;
            case "UNVERIFIED_EMAIL":
                i7 = 17086;
                break;
            case "REJECTED_CREDENTIAL":
                i7 = 17075;
                break;
            case "INVALID_MFA_PENDING_CREDENTIAL":
                i7 = 17083;
                break;
            case "INVALID_VERIFICATION_PROOF":
                i7 = 17049;
                break;
            case "INVALID_PROVIDER_ID":
                i7 = 17071;
                break;
            case "CREDENTIAL_MISMATCH":
                i7 = 17002;
                break;
            case "WEB_CONTEXT_CANCELED":
                i7 = 17058;
                break;
            case "REQUIRES_SECOND_FACTOR_AUTH":
                i7 = 17078;
                break;
            case "MISSING_CLIENT_IDENTIFIER":
                i7 = 17093;
                break;
            case "INVALID_MESSAGE_PAYLOAD":
                i7 = 17031;
                break;
            case "RESET_PASSWORD_EXCEED_LIMIT":
            case "TOO_MANY_ATTEMPTS_TRY_LATER":
                i7 = 17010;
                break;
            case "INVALID_CUSTOM_TOKEN":
                i7 = 17000;
                break;
            case "INVALID_PASSWORD":
                i7 = 17009;
                break;
            case "INVALID_RECAPTCHA_TOKEN":
                i7 = 17202;
                break;
            case "SESSION_EXPIRED":
                i7 = 17051;
                break;
            case "MISSING_CODE":
                i7 = 17043;
                break;
            case "FEDERATED_USER_ID_ALREADY_LINKED":
                i7 = 17025;
                break;
            case "MISSING_RECAPTCHA_TOKEN":
                i7 = 17201;
                break;
            case "USER_DISABLED":
                i7 = 17005;
                break;
            case "INVALID_PHONE_NUMBER":
                i7 = 17042;
                break;
            case "INVALID_APP_CREDENTIAL":
                i7 = 17028;
                break;
            case "MISSING_CONTINUE_URI":
                i7 = 17040;
                break;
            case "MISSING_SESSION_INFO":
                i7 = 17045;
                break;
            case "EMAIL_CHANGE_NEEDS_VERIFICATION":
                i7 = 17090;
                break;
            case "UNSUPPORTED_TENANT_OPERATION":
                i7 = 17073;
                break;
            default:
                i7 = 17499;
                break;
        }
        if (i7 != 17499) {
            return new Status(i7, str2);
        }
        if (str2 == null) {
            return new Status(i7, str);
        }
        return new Status(i7, str + ":" + str2);
    }
}
