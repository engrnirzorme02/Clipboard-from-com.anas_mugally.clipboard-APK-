package p310n6;

import kotlin.jvm.internal.AbstractC6118n;
import p278j6.AbstractC5905g;

/* JADX INFO: renamed from: n6.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6506c {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final long m27719d(long j7, int i7) {
        return C6504a.m27701k((j7 << 1) + ((long) i7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final long m27720e(long j7) {
        return C6504a.m27701k((j7 << 1) + 1);
    }

    /* JADX INFO: renamed from: f */
    private static final long m27721f(long j7) {
        return C6504a.m27701k(j7 << 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final long m27722g(long j7) {
        return j7 * ((long) 1000000);
    }

    /* JADX INFO: renamed from: h */
    public static final long m27723h(int i7, EnumC6507d unit) {
        AbstractC6118n.m27187e(unit, "unit");
        return unit.compareTo(EnumC6507d.SECONDS) <= 0 ? m27721f(AbstractC6508e.m27728b(i7, unit, EnumC6507d.NANOSECONDS)) : m27724i(i7, unit);
    }

    /* JADX INFO: renamed from: i */
    public static final long m27724i(long j7, EnumC6507d unit) {
        AbstractC6118n.m27187e(unit, "unit");
        EnumC6507d enumC6507d = EnumC6507d.NANOSECONDS;
        long jM27728b = AbstractC6508e.m27728b(4611686018426999999L, enumC6507d, unit);
        return ((-jM27728b) > j7 || j7 > jM27728b) ? m27720e(AbstractC5905g.m26660h(AbstractC6508e.m27727a(j7, unit, EnumC6507d.MILLISECONDS), -4611686018427387903L, 4611686018427387903L)) : m27721f(AbstractC6508e.m27728b(j7, unit, enumC6507d));
    }
}
