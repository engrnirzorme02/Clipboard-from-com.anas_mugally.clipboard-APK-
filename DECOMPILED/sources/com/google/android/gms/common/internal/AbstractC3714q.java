package com.google.android.gms.common.internal;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3714q {

    /* JADX INFO: renamed from: com.google.android.gms.common.internal.q$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final List f14823a;

        /* JADX INFO: renamed from: b */
        private final Object f14824b;

        /* synthetic */ a(Object obj, AbstractC3689d0 abstractC3689d0) {
            AbstractC3718s.m18083l(obj);
            this.f14824b = obj;
            this.f14823a = new ArrayList();
        }

        /* JADX INFO: renamed from: a */
        public a m18056a(String str, Object obj) {
            AbstractC3718s.m18083l(str);
            this.f14823a.add(str + "=" + String.valueOf(obj));
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f14824b.getClass().getSimpleName());
            sb.append('{');
            int size = this.f14823a.size();
            for (int i7 = 0; i7 < size; i7++) {
                sb.append((String) this.f14823a.get(i7));
                if (i7 < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m18052a(Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return bundle == bundle2;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        Set<String> setKeySet = bundle.keySet();
        if (!setKeySet.containsAll(bundle2.keySet())) {
            return false;
        }
        for (String str : setKeySet) {
            if (!m18053b(bundle.get(str), bundle2.get(str))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m18053b(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static int m18054c(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    /* JADX INFO: renamed from: d */
    public static a m18055d(Object obj) {
        return new a(obj, null);
    }
}
