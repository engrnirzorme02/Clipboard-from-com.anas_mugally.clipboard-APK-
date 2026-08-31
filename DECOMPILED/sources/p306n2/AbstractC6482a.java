package p306n2;

import android.util.SparseArray;
import java.util.HashMap;
import p198a2.EnumC2190f;

/* JADX INFO: renamed from: n2.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6482a {

    /* JADX INFO: renamed from: a */
    private static SparseArray f24541a = new SparseArray();

    /* JADX INFO: renamed from: b */
    private static HashMap f24542b;

    static {
        HashMap map = new HashMap();
        f24542b = map;
        map.put(EnumC2190f.DEFAULT, 0);
        f24542b.put(EnumC2190f.VERY_LOW, 1);
        f24542b.put(EnumC2190f.HIGHEST, 2);
        for (EnumC2190f enumC2190f : f24542b.keySet()) {
            f24541a.append(((Integer) f24542b.get(enumC2190f)).intValue(), enumC2190f);
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m27649a(EnumC2190f enumC2190f) {
        Integer num = (Integer) f24542b.get(enumC2190f);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + enumC2190f);
    }

    /* JADX INFO: renamed from: b */
    public static EnumC2190f m27650b(int i7) {
        EnumC2190f enumC2190f = (EnumC2190f) f24541a.get(i7);
        if (enumC2190f != null) {
            return enumC2190f;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i7);
    }
}
