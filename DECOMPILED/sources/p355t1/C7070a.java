package p355t1;

import android.content.Context;
import com.anas_mugally.clipboard.R;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: t1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C7070a {

    /* JADX INFO: renamed from: a */
    public static final C7070a f28232a = new C7070a();

    private C7070a() {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: a */
    public final String m31170a(Context context, String str) {
        AbstractC6118n.m27187e(context, "context");
        if (str != null) {
            switch (str.hashCode()) {
                case -2058905966:
                    if (str.equals("AI_PROCESSING_FAILED")) {
                        String string = context.getString(R.string.error_ai_processing_failed);
                        AbstractC6118n.m27186d(string, "getString(...)");
                        return string;
                    }
                    break;
                case -1421397742:
                    if (str.equals("INVALID_DATA")) {
                        String string2 = context.getString(R.string.error_invalid_data);
                        AbstractC6118n.m27186d(string2, "getString(...)");
                        return string2;
                    }
                    break;
                case -1356775180:
                    if (str.equals("UNAUTHORIZED")) {
                        String string3 = context.getString(R.string.error_unauthorized);
                        AbstractC6118n.m27186d(string3, "getString(...)");
                        return string3;
                    }
                    break;
                case -1235530362:
                    if (str.equals("AUTHENTICATION_REQUIRED")) {
                        String string4 = context.getString(R.string.error_authentication_required);
                        AbstractC6118n.m27186d(string4, "getString(...)");
                        return string4;
                    }
                    break;
                case -1098472079:
                    if (str.equals("INVALID_TOKEN")) {
                        String string5 = context.getString(R.string.error_invalid_token);
                        AbstractC6118n.m27186d(string5, "getString(...)");
                        return string5;
                    }
                    break;
                case -1070494644:
                    if (str.equals("PROMPT_TYPE_NOT_FOUND")) {
                        String string6 = context.getString(R.string.error_prompt_type_not_found);
                        AbstractC6118n.m27186d(string6, "getString(...)");
                        return string6;
                    }
                    break;
                case -879828873:
                    if (str.equals("NETWORK_ERROR")) {
                        String string7 = context.getString(R.string.error_network);
                        AbstractC6118n.m27186d(string7, "getString(...)");
                        return string7;
                    }
                    break;
                case 429171735:
                    if (str.equals("APP_UPDATE_REQUIRED")) {
                        String string8 = context.getString(R.string.error_app_update_required);
                        AbstractC6118n.m27186d(string8, "getString(...)");
                        return string8;
                    }
                    break;
                case 752440957:
                    if (str.equals("DAILY_LIMIT_EXCEEDED")) {
                        String string9 = context.getString(R.string.error_daily_limit_exceeded);
                        AbstractC6118n.m27186d(string9, "getString(...)");
                        return string9;
                    }
                    break;
                case 1178575340:
                    if (str.equals("SERVER_ERROR")) {
                        String string10 = context.getString(R.string.error_server);
                        AbstractC6118n.m27186d(string10, "getString(...)");
                        return string10;
                    }
                    break;
                case 1776037267:
                    if (str.equals("UNKNOWN_ERROR")) {
                        String string11 = context.getString(R.string.error_unknown);
                        AbstractC6118n.m27186d(string11, "getString(...)");
                        return string11;
                    }
                    break;
            }
        }
        String string12 = context.getString(R.string.error_unknown);
        AbstractC6118n.m27186d(string12, "getString(...)");
        return string12;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m31171b(String str) {
        return AbstractC6118n.m27183a(str, "NETWORK_ERROR") || AbstractC6118n.m27183a(str, "SERVER_ERROR");
    }

    /* JADX INFO: renamed from: c */
    public final boolean m31172c(String str) {
        if (str == null) {
            return false;
        }
        int iHashCode = str.hashCode();
        if (iHashCode == -1356775180) {
            return str.equals("UNAUTHORIZED");
        }
        if (iHashCode != -1235530362) {
            return iHashCode == -1098472079 && str.equals("INVALID_TOKEN");
        }
        return str.equals("AUTHENTICATION_REQUIRED");
    }

    /* JADX INFO: renamed from: d */
    public final boolean m31173d(String str) {
        return AbstractC6118n.m27183a(str, "APP_UPDATE_REQUIRED") || AbstractC6118n.m27183a(str, "INVALID_DATA");
    }

    /* JADX INFO: renamed from: e */
    public final boolean m31174e(String str) {
        return AbstractC6118n.m27183a(str, "DAILY_LIMIT_EXCEEDED");
    }
}
