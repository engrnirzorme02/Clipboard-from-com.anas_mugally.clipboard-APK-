package p224d0;

import android.util.AndroidRuntimeException;

/* JADX INFO: renamed from: d0.k */
/* JADX INFO: loaded from: classes.dex */
public final class C5207k extends AbstractC5204h {

    /* JADX INFO: renamed from: B */
    private C5208l f19890B;

    /* JADX INFO: renamed from: C */
    private float f19891C;

    /* JADX INFO: renamed from: D */
    private boolean f19892D;

    public C5207k(Object obj, AbstractC5205i abstractC5205i) {
        super(obj, abstractC5205i);
        this.f19890B = null;
        this.f19891C = Float.MAX_VALUE;
        this.f19892D = false;
    }

    /* JADX INFO: renamed from: p */
    private void m24079p() {
        C5208l c5208l = this.f19890B;
        if (c5208l == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double dM24087b = c5208l.m24087b();
        if (dM24087b > this.f19880g) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (dM24087b < this.f19881h) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
    }

    @Override // p224d0.AbstractC5204h
    /* JADX INFO: renamed from: j */
    public void mo24049j() {
        m24079p();
        this.f19890B.m24093i(m24045e());
        super.mo24049j();
    }

    @Override // p224d0.AbstractC5204h
    /* JADX INFO: renamed from: l */
    boolean mo24050l(long j7) {
        if (this.f19892D) {
            float f7 = this.f19891C;
            if (f7 != Float.MAX_VALUE) {
                this.f19890B.m24091g(f7);
                this.f19891C = Float.MAX_VALUE;
            }
            this.f19875b = this.f19890B.m24087b();
            this.f19874a = 0.0f;
            this.f19892D = false;
            return true;
        }
        if (this.f19891C != Float.MAX_VALUE) {
            long j8 = j7 / 2;
            AbstractC5204h.o oVarM24094j = this.f19890B.m24094j(this.f19875b, this.f19874a, j8);
            this.f19890B.m24091g(this.f19891C);
            this.f19891C = Float.MAX_VALUE;
            AbstractC5204h.o oVarM24094j2 = this.f19890B.m24094j(oVarM24094j.f19887a, oVarM24094j.f19888b, j8);
            this.f19875b = oVarM24094j2.f19887a;
            this.f19874a = oVarM24094j2.f19888b;
        } else {
            AbstractC5204h.o oVarM24094j3 = this.f19890B.m24094j(this.f19875b, this.f19874a, j7);
            this.f19875b = oVarM24094j3.f19887a;
            this.f19874a = oVarM24094j3.f19888b;
        }
        float fMax = Math.max(this.f19875b, this.f19881h);
        this.f19875b = fMax;
        float fMin = Math.min(fMax, this.f19880g);
        this.f19875b = fMin;
        if (!m24082o(fMin, this.f19874a)) {
            return false;
        }
        this.f19875b = this.f19890B.m24087b();
        this.f19874a = 0.0f;
        return true;
    }

    /* JADX INFO: renamed from: m */
    public void m24080m(float f7) {
        if (m24046f()) {
            this.f19891C = f7;
            return;
        }
        if (this.f19890B == null) {
            this.f19890B = new C5208l(f7);
        }
        this.f19890B.m24091g(f7);
        mo24049j();
    }

    /* JADX INFO: renamed from: n */
    public boolean m24081n() {
        return this.f19890B.f19894b > 0.0d;
    }

    /* JADX INFO: renamed from: o */
    boolean m24082o(float f7, float f8) {
        return this.f19890B.m24089e(f7, f8);
    }

    /* JADX INFO: renamed from: q */
    public C5207k m24083q(C5208l c5208l) {
        this.f19890B = c5208l;
        return this;
    }

    /* JADX INFO: renamed from: r */
    public void m24084r() {
        if (!m24081n()) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (!m24044c().m24028j()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.f19879f) {
            this.f19892D = true;
        }
    }
}
