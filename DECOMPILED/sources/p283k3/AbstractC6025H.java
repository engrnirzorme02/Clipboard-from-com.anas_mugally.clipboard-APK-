package p283k3;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3718s;

/* JADX INFO: renamed from: k3.H */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6025H {
    /* JADX INFO: renamed from: a */
    public static String m27045a(Context context, String str, String str2) {
        AbstractC3718s.m18083l(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str2)) {
            str2 = AbstractC6044o.m27050a(context);
        }
        return AbstractC6044o.m27051b("google_app_id", resources, str2);
    }

    /* JADX INFO: renamed from: b */
    public static String m27046b(String str, String[] strArr, String[] strArr2) {
        AbstractC3718s.m18083l(strArr);
        AbstractC3718s.m18083l(strArr2);
        int iMin = Math.min(strArr.length, strArr2.length);
        for (int i7 = 0; i7 < iMin; i7++) {
            String str2 = strArr[i7];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i7];
            }
        }
        return null;
    }
}
