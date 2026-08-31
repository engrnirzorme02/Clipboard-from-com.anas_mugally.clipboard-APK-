package p063H5;

import p122P3.AbstractC1203g;

/* JADX INFO: renamed from: H5.y */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0573y extends AbstractC0527W {
    protected AbstractC0573y() {
    }

    @Override // p063H5.AbstractC0527W
    /* JADX INFO: renamed from: a */
    public AbstractC0526V mo2250a() {
        return mo2535e().mo2250a();
    }

    /* JADX INFO: renamed from: e */
    protected abstract AbstractC0527W mo2535e();

    public String toString() {
        return AbstractC1203g.m5267b(this).m5277d("delegate", mo2535e()).toString();
    }
}
