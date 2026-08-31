package p063H5;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: H5.z */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0574z extends AbstractC0573y {
    protected AbstractC0574z() {
    }

    /* JADX INFO: renamed from: g */
    private AbstractC0574z m2536g() {
        return this;
    }

    @Override // p063H5.AbstractC0573y
    /* JADX INFO: renamed from: e */
    protected abstract AbstractC0527W mo2535e();

    @Override // p063H5.AbstractC0527W
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public AbstractC0574z mo2251c(long j7, TimeUnit timeUnit) {
        mo2535e().mo2251c(j7, timeUnit);
        return m2536g();
    }

    @Override // p063H5.AbstractC0527W
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public AbstractC0574z mo2252d() {
        mo2535e().mo2252d();
        return m2536g();
    }
}
