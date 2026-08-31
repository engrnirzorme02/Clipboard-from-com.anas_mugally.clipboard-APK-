package p208b2;

import android.util.SparseArray;

/* JADX INFO: renamed from: b2.x */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC2958x {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: s */
    private static final SparseArray f12247s;

    /* JADX INFO: renamed from: a */
    private final int f12249a;

    static {
        EnumC2958x enumC2958x = DEFAULT;
        EnumC2958x enumC2958x2 = UNMETERED_ONLY;
        EnumC2958x enumC2958x3 = UNMETERED_OR_DAILY;
        EnumC2958x enumC2958x4 = FAST_IF_RADIO_AWAKE;
        EnumC2958x enumC2958x5 = NEVER;
        EnumC2958x enumC2958x6 = UNRECOGNIZED;
        SparseArray sparseArray = new SparseArray();
        f12247s = sparseArray;
        sparseArray.put(0, enumC2958x);
        sparseArray.put(1, enumC2958x2);
        sparseArray.put(2, enumC2958x3);
        sparseArray.put(3, enumC2958x4);
        sparseArray.put(4, enumC2958x5);
        sparseArray.put(-1, enumC2958x6);
    }

    EnumC2958x(int i7) {
        this.f12249a = i7;
    }
}
