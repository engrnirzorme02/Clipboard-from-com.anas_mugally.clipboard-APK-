package p175X0;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.UUID;
import p112O0.EnumC1106s;
import p112O0.InterfaceC1100m;
import p119P0.AbstractC1179f;
import p119P0.C1176c;
import p119P0.C1182i;
import p119P0.InterfaceC1178e;
import p168W0.InterfaceC1800b;
import p168W0.InterfaceC1815q;

/* JADX INFO: renamed from: X0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractRunnableC1923a implements Runnable {

    /* JADX INFO: renamed from: a */
    private final C1176c f6364a = new C1176c();

    /* JADX INFO: renamed from: X0.a$a */
    class a extends AbstractRunnableC1923a {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C1182i f6365b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ UUID f6366c;

        a(C1182i c1182i, UUID uuid) {
            this.f6365b = c1182i;
            this.f6366c = uuid;
        }

        @Override // p175X0.AbstractRunnableC1923a
        /* JADX INFO: renamed from: h */
        void mo7962h() {
            WorkDatabase workDatabaseM5173o = this.f6365b.m5173o();
            workDatabaseM5173o.m33029e();
            try {
                m7959a(this.f6365b, this.f6366c.toString());
                workDatabaseM5173o.m33042z();
                workDatabaseM5173o.m33031i();
                m7961g(this.f6365b);
            } catch (Throwable th) {
                workDatabaseM5173o.m33031i();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: X0.a$b */
    class b extends AbstractRunnableC1923a {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C1182i f6367b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f6368c;

        b(C1182i c1182i, String str) {
            this.f6367b = c1182i;
            this.f6368c = str;
        }

        @Override // p175X0.AbstractRunnableC1923a
        /* JADX INFO: renamed from: h */
        void mo7962h() {
            WorkDatabase workDatabaseM5173o = this.f6367b.m5173o();
            workDatabaseM5173o.m33029e();
            try {
                Iterator it = workDatabaseM5173o.mo14518K().mo7552p(this.f6368c).iterator();
                while (it.hasNext()) {
                    m7959a(this.f6367b, (String) it.next());
                }
                workDatabaseM5173o.m33042z();
                workDatabaseM5173o.m33031i();
                m7961g(this.f6367b);
            } catch (Throwable th) {
                workDatabaseM5173o.m33031i();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: X0.a$c */
    class c extends AbstractRunnableC1923a {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C1182i f6369b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f6370c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ boolean f6371d;

        c(C1182i c1182i, String str, boolean z7) {
            this.f6369b = c1182i;
            this.f6370c = str;
            this.f6371d = z7;
        }

        @Override // p175X0.AbstractRunnableC1923a
        /* JADX INFO: renamed from: h */
        void mo7962h() {
            WorkDatabase workDatabaseM5173o = this.f6369b.m5173o();
            workDatabaseM5173o.m33029e();
            try {
                Iterator it = workDatabaseM5173o.mo14518K().mo7548l(this.f6370c).iterator();
                while (it.hasNext()) {
                    m7959a(this.f6369b, (String) it.next());
                }
                workDatabaseM5173o.m33042z();
                workDatabaseM5173o.m33031i();
                if (this.f6371d) {
                    m7961g(this.f6369b);
                }
            } catch (Throwable th) {
                workDatabaseM5173o.m33031i();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static AbstractRunnableC1923a m7955b(UUID uuid, C1182i c1182i) {
        return new a(c1182i, uuid);
    }

    /* JADX INFO: renamed from: c */
    public static AbstractRunnableC1923a m7956c(String str, C1182i c1182i, boolean z7) {
        return new c(c1182i, str, z7);
    }

    /* JADX INFO: renamed from: d */
    public static AbstractRunnableC1923a m7957d(String str, C1182i c1182i) {
        return new b(c1182i, str);
    }

    /* JADX INFO: renamed from: f */
    private void m7958f(WorkDatabase workDatabase, String str) {
        InterfaceC1815q interfaceC1815qMo14518K = workDatabase.mo14518K();
        InterfaceC1800b interfaceC1800bMo14513C = workDatabase.mo14513C();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            EnumC1106s enumC1106sMo7549m = interfaceC1815qMo14518K.mo7549m(str2);
            if (enumC1106sMo7549m != EnumC1106s.SUCCEEDED && enumC1106sMo7549m != EnumC1106s.FAILED) {
                interfaceC1815qMo14518K.mo7546j(EnumC1106s.CANCELLED, str2);
            }
            linkedList.addAll(interfaceC1800bMo14513C.mo7510a(str2));
        }
    }

    /* JADX INFO: renamed from: a */
    void m7959a(C1182i c1182i, String str) {
        m7958f(c1182i.m5173o(), str);
        c1182i.m5171m().m5136l(str);
        Iterator it = c1182i.m5172n().iterator();
        while (it.hasNext()) {
            ((InterfaceC1178e) it.next()).mo5141e(str);
        }
    }

    /* JADX INFO: renamed from: e */
    public InterfaceC1100m m7960e() {
        return this.f6364a;
    }

    /* JADX INFO: renamed from: g */
    void m7961g(C1182i c1182i) {
        AbstractC1179f.m5143b(c1182i.m5169i(), c1182i.m5173o(), c1182i.m5172n());
    }

    /* JADX INFO: renamed from: h */
    abstract void mo7962h();

    @Override // java.lang.Runnable
    public void run() {
        try {
            mo7962h();
            this.f6364a.m5124a(InterfaceC1100m.f3962a);
        } catch (Throwable th) {
            this.f6364a.m5124a(new InterfaceC1100m.b.a(th));
        }
    }
}
