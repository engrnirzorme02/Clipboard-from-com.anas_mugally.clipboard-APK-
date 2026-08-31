package p087K5;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: K5.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0763l {

    /* JADX INFO: renamed from: a */
    public static final String[] f3103a = new String[0];

    /* JADX INFO: renamed from: b */
    public static final Charset f3104b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public static List m3591a(Object[] objArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) objArr.clone()));
    }

    /* JADX INFO: renamed from: b */
    private static List m3592b(Object[] objArr, Object[] objArr2) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            for (Object obj2 : objArr2) {
                if (obj.equals(obj2)) {
                    arrayList.add(obj2);
                    break;
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public static Object[] m3593c(Class cls, Object[] objArr, Object[] objArr2) {
        List listM3592b = m3592b(objArr, objArr2);
        return listM3592b.toArray((Object[]) Array.newInstance((Class<?>) cls, listM3592b.size()));
    }
}
