package p124P5;

import java.util.concurrent.ScheduledExecutorService;
import p063H5.AbstractC0523S;
import p063H5.AbstractC0541f;
import p063H5.EnumC0561p;
import p063H5.ExecutorC0562p0;
import p122P3.AbstractC1203g;

/* JADX INFO: renamed from: P5.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1232c extends AbstractC0523S.e {
    @Override // p063H5.AbstractC0523S.e
    /* JADX INFO: renamed from: a */
    public AbstractC0523S.i mo2194a(AbstractC0523S.b bVar) {
        return mo5353g().mo2194a(bVar);
    }

    @Override // p063H5.AbstractC0523S.e
    /* JADX INFO: renamed from: b */
    public AbstractC0541f mo2195b() {
        return mo5353g().mo2195b();
    }

    @Override // p063H5.AbstractC0523S.e
    /* JADX INFO: renamed from: c */
    public ScheduledExecutorService mo2196c() {
        return mo5353g().mo2196c();
    }

    @Override // p063H5.AbstractC0523S.e
    /* JADX INFO: renamed from: d */
    public ExecutorC0562p0 mo2197d() {
        return mo5353g().mo2197d();
    }

    @Override // p063H5.AbstractC0523S.e
    /* JADX INFO: renamed from: e */
    public void mo2198e() {
        mo5353g().mo2198e();
    }

    @Override // p063H5.AbstractC0523S.e
    /* JADX INFO: renamed from: f */
    public void mo2199f(EnumC0561p enumC0561p, AbstractC0523S.j jVar) {
        mo5353g().mo2199f(enumC0561p, jVar);
    }

    /* JADX INFO: renamed from: g */
    protected abstract AbstractC0523S.e mo5353g();

    public String toString() {
        return AbstractC1203g.m5267b(this).m5277d("delegate", mo5353g()).toString();
    }
}
