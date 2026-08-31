package p122P3;

import com.google.android.gms.common.api.C3553a;

/* JADX INFO: renamed from: P3.o */
/* JADX INFO: loaded from: classes2.dex */
public final class C1211o {

    /* JADX INFO: renamed from: a */
    private final AbstractC1198b f4295a;

    /* JADX INFO: renamed from: b */
    private final boolean f4296b;

    /* JADX INFO: renamed from: c */
    private final b f4297c;

    /* JADX INFO: renamed from: d */
    private final int f4298d;

    /* JADX INFO: renamed from: P3.o$a */
    class a implements b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AbstractC1198b f4299a;

        a(AbstractC1198b abstractC1198b) {
            this.f4299a = abstractC1198b;
        }
    }

    /* JADX INFO: renamed from: P3.o$b */
    private interface b {
    }

    private C1211o(b bVar) {
        this(bVar, false, AbstractC1198b.m5257c(), C3553a.e.API_PRIORITY_OTHER);
    }

    /* JADX INFO: renamed from: a */
    public static C1211o m5312a(char c7) {
        return m5313b(AbstractC1198b.m5256b(c7));
    }

    /* JADX INFO: renamed from: b */
    public static C1211o m5313b(AbstractC1198b abstractC1198b) {
        AbstractC1209m.m5302n(abstractC1198b);
        return new C1211o(new a(abstractC1198b));
    }

    /* JADX INFO: renamed from: c */
    public C1211o m5314c() {
        return m5315d(AbstractC1198b.m5259e());
    }

    /* JADX INFO: renamed from: d */
    public C1211o m5315d(AbstractC1198b abstractC1198b) {
        AbstractC1209m.m5302n(abstractC1198b);
        return new C1211o(this.f4297c, this.f4296b, abstractC1198b, this.f4298d);
    }

    private C1211o(b bVar, boolean z7, AbstractC1198b abstractC1198b, int i7) {
        this.f4297c = bVar;
        this.f4296b = z7;
        this.f4295a = abstractC1198b;
        this.f4298d = i7;
    }
}
