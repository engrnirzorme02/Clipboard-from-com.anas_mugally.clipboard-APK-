package p270i6;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.AbstractC6118n;
import p262h6.AbstractC5655a;

/* JADX INFO: renamed from: i6.a */
/* JADX INFO: loaded from: classes.dex */
public final class C5721a extends AbstractC5655a {
    @Override // p262h6.AbstractC5657c
    /* JADX INFO: renamed from: f */
    public int mo25169f(int i7, int i8) {
        return ThreadLocalRandom.current().nextInt(i7, i8);
    }

    @Override // p262h6.AbstractC5655a
    /* JADX INFO: renamed from: g */
    public Random mo25166g() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        AbstractC6118n.m27186d(threadLocalRandomCurrent, "current(...)");
        return threadLocalRandomCurrent;
    }
}
