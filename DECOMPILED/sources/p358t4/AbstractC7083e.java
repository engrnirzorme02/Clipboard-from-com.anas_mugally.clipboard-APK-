package p358t4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: t4.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7083e {
    /* JADX INFO: renamed from: a */
    public static void m31230a(boolean z7) {
        m31231b(z7, "", new Object[0]);
    }

    /* JADX INFO: renamed from: b */
    public static void m31231b(boolean z7, String str, Object... objArr) {
        if (z7) {
            return;
        }
        throw new AssertionError("hardAssert failed: " + String.format(str, objArr));
    }

    /* JADX INFO: renamed from: c */
    public static Long m31232c(Object obj) {
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            return (Long) obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static String m31233d(List list) {
        if (list.isEmpty()) {
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        boolean z7 = true;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!z7) {
                sb.append("/");
            }
            sb.append(str);
            z7 = false;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: e */
    public static List m31234e(String str) {
        ArrayList arrayList = new ArrayList();
        String[] strArrSplit = str.split("/", -1);
        for (int i7 = 0; i7 < strArrSplit.length; i7++) {
            if (!strArrSplit[i7].isEmpty()) {
                arrayList.add(strArrSplit[i7]);
            }
        }
        return arrayList;
    }
}
