package androidx.work.impl;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p026D0.InterfaceC0176g;
import p026D0.InterfaceC0177h;
import p034E0.C0277f;
import p119P0.AbstractC1181h;
import p168W0.InterfaceC1800b;
import p168W0.InterfaceC1803e;
import p168W0.InterfaceC1806h;
import p168W0.InterfaceC1809k;
import p168W0.InterfaceC1812n;
import p168W0.InterfaceC1815q;
import p168W0.InterfaceC1818t;
import p394y0.AbstractC7462q;
import p394y0.C7461p;

/* JADX INFO: loaded from: classes.dex */
public abstract class WorkDatabase extends AbstractC7462q {

    /* JADX INFO: renamed from: p */
    private static final long f11887p = TimeUnit.DAYS.toMillis(1);

    /* JADX INFO: renamed from: androidx.work.impl.WorkDatabase$a */
    class C2897a implements InterfaceC0177h.c {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f11888a;

        C2897a(Context context) {
            this.f11888a = context;
        }

        @Override // p026D0.InterfaceC0177h.c
        /* JADX INFO: renamed from: a */
        public InterfaceC0177h mo906a(InterfaceC0177h.b bVar) {
            InterfaceC0177h.b.a aVarM900a = InterfaceC0177h.b.m900a(this.f11888a);
            aVarM900a.m903c(bVar.f824b).m902b(bVar.f825c).m904d(true);
            return new C0277f().mo906a(aVarM900a.m901a());
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.WorkDatabase$b */
    class C2898b extends AbstractC7462q.b {
        C2898b() {
        }

        @Override // p394y0.AbstractC7462q.b
        /* JADX INFO: renamed from: c */
        public void mo14520c(InterfaceC0176g interfaceC0176g) {
            super.mo14520c(interfaceC0176g);
            interfaceC0176g.mo882c();
            try {
                interfaceC0176g.mo888s(WorkDatabase.m14512F());
                interfaceC0176g.mo883h();
            } finally {
                interfaceC0176g.mo885j();
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public static WorkDatabase m14509B(Context context, Executor executor, boolean z7) {
        AbstractC7462q.a aVarM33018a;
        if (z7) {
            aVarM33018a = C7461p.m33020c(context, WorkDatabase.class).m33045c();
        } else {
            aVarM33018a = C7461p.m33018a(context, WorkDatabase.class, AbstractC1181h.m5159d());
            aVarM33018a.m33048f(new C2897a(context));
        }
        return (WorkDatabase) aVarM33018a.m33049g(executor).m33043a(m14510D()).m33044b(AbstractC2900a.f11897a).m33044b(new AbstractC2900a.h(context, 2, 3)).m33044b(AbstractC2900a.f11898b).m33044b(AbstractC2900a.f11899c).m33044b(new AbstractC2900a.h(context, 5, 6)).m33044b(AbstractC2900a.f11900d).m33044b(AbstractC2900a.f11901e).m33044b(AbstractC2900a.f11902f).m33044b(new AbstractC2900a.i(context)).m33044b(new AbstractC2900a.h(context, 10, 11)).m33044b(AbstractC2900a.f11903g).m33047e().m33046d();
    }

    /* JADX INFO: renamed from: D */
    static AbstractC7462q.b m14510D() {
        return new C2898b();
    }

    /* JADX INFO: renamed from: E */
    static long m14511E() {
        return System.currentTimeMillis() - f11887p;
    }

    /* JADX INFO: renamed from: F */
    static String m14512F() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + m14511E() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    /* JADX INFO: renamed from: C */
    public abstract InterfaceC1800b mo14513C();

    /* JADX INFO: renamed from: G */
    public abstract InterfaceC1803e mo14514G();

    /* JADX INFO: renamed from: H */
    public abstract InterfaceC1806h mo14515H();

    /* JADX INFO: renamed from: I */
    public abstract InterfaceC1809k mo14516I();

    /* JADX INFO: renamed from: J */
    public abstract InterfaceC1812n mo14517J();

    /* JADX INFO: renamed from: K */
    public abstract InterfaceC1815q mo14518K();

    /* JADX INFO: renamed from: L */
    public abstract InterfaceC1818t mo14519L();
}
