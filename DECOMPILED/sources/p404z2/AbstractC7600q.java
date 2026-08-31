package p404z2;

import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC3714q;
import java.lang.reflect.Array;

/* JADX INFO: renamed from: z2.q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7600q {
    /* JADX INFO: renamed from: a */
    public static boolean m33336a(Bundle bundle, Bundle bundle2) {
        if (bundle != null && bundle2 != null) {
            if (bundle.size() != bundle2.size()) {
                return false;
            }
            for (String str : bundle.keySet()) {
                if (!bundle2.containsKey(str)) {
                    return false;
                }
                Object obj = bundle.get(str);
                Object obj2 = bundle2.get(str);
                if (obj == null || obj2 == null) {
                    bundle2 = obj2;
                    bundle = obj;
                } else if (obj instanceof Bundle) {
                    if (!(obj2 instanceof Bundle) || !m33336a((Bundle) obj, (Bundle) obj2)) {
                        return false;
                    }
                } else if (obj.getClass().isArray()) {
                    int length = Array.getLength(obj);
                    if (!obj2.getClass().isArray() || length != Array.getLength(obj2)) {
                        return false;
                    }
                    for (int i7 = 0; i7 < length; i7++) {
                        if (!AbstractC3714q.m18053b(Array.get(obj, i7), Array.get(obj2, i7))) {
                            return false;
                        }
                    }
                } else if (!obj.equals(obj2)) {
                    return false;
                }
            }
            return true;
        }
        return bundle == null && bundle2 == null;
    }
}
