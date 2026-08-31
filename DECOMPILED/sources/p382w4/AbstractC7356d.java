package p382w4;

import p030D4.C0198b;
import p374v4.C7245j;

/* JADX INFO: renamed from: w4.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7356d {

    /* JADX INFO: renamed from: a */
    protected final a f29305a;

    /* JADX INFO: renamed from: b */
    protected final C7357e f29306b;

    /* JADX INFO: renamed from: c */
    protected final C7245j f29307c;

    /* JADX INFO: renamed from: w4.d$a */
    public enum a {
        Overwrite,
        Merge,
        AckUserWrite,
        ListenComplete
    }

    protected AbstractC7356d(a aVar, C7357e c7357e, C7245j c7245j) {
        this.f29305a = aVar;
        this.f29306b = c7357e;
        this.f29307c = c7245j;
    }

    /* JADX INFO: renamed from: a */
    public C7245j m32383a() {
        return this.f29307c;
    }

    /* JADX INFO: renamed from: b */
    public C7357e m32384b() {
        return this.f29306b;
    }

    /* JADX INFO: renamed from: c */
    public a m32385c() {
        return this.f29305a;
    }

    /* JADX INFO: renamed from: d */
    public abstract AbstractC7356d mo32379d(C0198b c0198b);
}
