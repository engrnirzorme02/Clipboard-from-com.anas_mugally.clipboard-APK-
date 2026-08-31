package p262h6;

import java.util.Random;

/* JADX INFO: renamed from: h6.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5655a extends AbstractC5657c {
    @Override // p262h6.AbstractC5657c
    /* JADX INFO: renamed from: b */
    public int mo25162b(int i7) {
        return AbstractC5658d.m25173d(mo25166g().nextInt(), i7);
    }

    @Override // p262h6.AbstractC5657c
    /* JADX INFO: renamed from: c */
    public boolean mo25163c() {
        return mo25166g().nextBoolean();
    }

    @Override // p262h6.AbstractC5657c
    /* JADX INFO: renamed from: d */
    public int mo25164d() {
        return mo25166g().nextInt();
    }

    @Override // p262h6.AbstractC5657c
    /* JADX INFO: renamed from: e */
    public int mo25165e(int i7) {
        return mo25166g().nextInt(i7);
    }

    /* JADX INFO: renamed from: g */
    public abstract Random mo25166g();
}
