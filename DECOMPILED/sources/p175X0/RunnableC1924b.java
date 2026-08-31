package p175X0;

import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p112O0.AbstractC1097j;
import p112O0.AbstractC1108u;
import p112O0.EnumC1091d;
import p112O0.EnumC1106s;
import p112O0.InterfaceC1100m;
import p119P0.AbstractC1179f;
import p119P0.C1176c;
import p119P0.C1180g;
import p119P0.C1182i;
import p168W0.C1799a;
import p168W0.C1808j;
import p168W0.C1814p;
import p168W0.C1817s;
import p168W0.InterfaceC1800b;
import p168W0.InterfaceC1815q;

/* JADX INFO: renamed from: X0.b */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC1924b implements Runnable {

    /* JADX INFO: renamed from: c */
    private static final String f6372c = AbstractC1097j.m4846f("EnqueueRunnable");

    /* JADX INFO: renamed from: a */
    private final C1180g f6373a;

    /* JADX INFO: renamed from: b */
    private final C1176c f6374b = new C1176c();

    public RunnableC1924b(C1180g c1180g) {
        this.f6373a = c1180g;
    }

    /* JADX INFO: renamed from: b */
    private static boolean m7963b(C1180g c1180g) {
        boolean zM7964c = m7964c(c1180g.m5152g(), c1180g.m5151f(), (String[]) C1180g.m5145l(c1180g).toArray(new String[0]), c1180g.m5149d(), c1180g.m5147b());
        c1180g.m5155k();
        return zM7964c;
    }

    /* JADX WARN: Code duplicated, block: B:82:0x0135 A[PHI: r0 r8 r11 r12 r13
      0x0135: PHI (r0v1 java.lang.String[]) = 
      (r0v0 java.lang.String[])
      (r0v0 java.lang.String[])
      (r0v0 java.lang.String[])
      (r0v13 java.lang.String[])
      (r0v13 java.lang.String[])
     binds: [B:28:0x0061, B:29:0x0063, B:31:0x0071, B:81:0x0134, B:80:0x0132] A[DONT_GENERATE, DONT_INLINE]
      0x0135: PHI (r8v2 boolean) = (r8v1 boolean), (r8v1 boolean), (r8v1 boolean), (r8v5 boolean), (r8v6 boolean) binds: [B:28:0x0061, B:29:0x0063, B:31:0x0071, B:81:0x0134, B:80:0x0132] A[DONT_GENERATE, DONT_INLINE]
      0x0135: PHI (r11v2 boolean) = (r11v1 boolean), (r11v1 boolean), (r11v1 boolean), (r11v4 boolean), (r11v4 boolean) binds: [B:28:0x0061, B:29:0x0063, B:31:0x0071, B:81:0x0134, B:80:0x0132] A[DONT_GENERATE, DONT_INLINE]
      0x0135: PHI (r12v2 boolean) = (r12v1 boolean), (r12v1 boolean), (r12v1 boolean), (r12v5 boolean), (r12v5 boolean) binds: [B:28:0x0061, B:29:0x0063, B:31:0x0071, B:81:0x0134, B:80:0x0132] A[DONT_GENERATE, DONT_INLINE]
      0x0135: PHI (r13v2 boolean) = (r13v1 boolean), (r13v1 boolean), (r13v1 boolean), (r13v5 boolean), (r13v5 boolean) binds: [B:28:0x0061, B:29:0x0063, B:31:0x0071, B:81:0x0134, B:80:0x0132] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: c */
    private static boolean m7964c(C1182i c1182i, List list, String[] strArr, String str, EnumC1091d enumC1091d) {
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        String[] strArr2 = strArr;
        long jCurrentTimeMillis = System.currentTimeMillis();
        WorkDatabase workDatabaseM5173o = c1182i.m5173o();
        boolean z11 = strArr2 != null && strArr2.length > 0;
        if (z11) {
            z7 = false;
            z8 = false;
            z9 = true;
            for (String str2 : strArr2) {
                C1814p c1814pMo7550n = workDatabaseM5173o.mo14518K().mo7550n(str2);
                if (c1814pMo7550n == null) {
                    AbstractC1097j.m4844c().mo4848b(f6372c, String.format("Prerequisite %s doesn't exist; not enqueuing", str2), new Throwable[0]);
                    return false;
                }
                EnumC1106s enumC1106s = c1814pMo7550n.f5893b;
                z9 &= enumC1106s == EnumC1106s.SUCCEEDED;
                if (enumC1106s == EnumC1106s.FAILED) {
                    z8 = true;
                } else if (enumC1106s == EnumC1106s.CANCELLED) {
                    z7 = true;
                }
            }
        } else {
            z7 = false;
            z8 = false;
            z9 = true;
        }
        boolean zIsEmpty = TextUtils.isEmpty(str);
        if (zIsEmpty || z11) {
            z10 = false;
        } else {
            List<C1814p.b> listMo7539c = workDatabaseM5173o.mo14518K().mo7539c(str);
            if (listMo7539c.isEmpty()) {
                z10 = false;
            } else if (enumC1091d == EnumC1091d.APPEND || enumC1091d == EnumC1091d.APPEND_OR_REPLACE) {
                InterfaceC1800b interfaceC1800bMo14513C = workDatabaseM5173o.mo14513C();
                List arrayList = new ArrayList();
                for (C1814p.b bVar : listMo7539c) {
                    if (!interfaceC1800bMo14513C.mo7513d(bVar.f5910a)) {
                        EnumC1106s enumC1106s2 = bVar.f5911b;
                        boolean z12 = (enumC1106s2 == EnumC1106s.SUCCEEDED) & z9;
                        if (enumC1106s2 == EnumC1106s.FAILED) {
                            z8 = true;
                        } else if (enumC1106s2 == EnumC1106s.CANCELLED) {
                            z7 = true;
                        }
                        arrayList.add(bVar.f5910a);
                        z9 = z12;
                    }
                }
                if (enumC1091d == EnumC1091d.APPEND_OR_REPLACE && (z7 || z8)) {
                    InterfaceC1815q interfaceC1815qMo14518K = workDatabaseM5173o.mo14518K();
                    Iterator it = interfaceC1815qMo14518K.mo7539c(str).iterator();
                    while (it.hasNext()) {
                        interfaceC1815qMo14518K.mo7537a(((C1814p.b) it.next()).f5910a);
                    }
                    arrayList = Collections.EMPTY_LIST;
                    z7 = false;
                    z8 = false;
                }
                strArr2 = (String[]) arrayList.toArray(strArr2);
                z11 = strArr2.length > 0;
                z10 = false;
            } else {
                if (enumC1091d == EnumC1091d.KEEP) {
                    Iterator it2 = listMo7539c.iterator();
                    while (it2.hasNext()) {
                        EnumC1106s enumC1106s3 = ((C1814p.b) it2.next()).f5911b;
                        if (enumC1106s3 == EnumC1106s.ENQUEUED || enumC1106s3 == EnumC1106s.RUNNING) {
                            return false;
                        }
                    }
                }
                AbstractRunnableC1923a.m7956c(str, c1182i, false).run();
                InterfaceC1815q interfaceC1815qMo14518K2 = workDatabaseM5173o.mo14518K();
                Iterator it3 = listMo7539c.iterator();
                while (it3.hasNext()) {
                    interfaceC1815qMo14518K2.mo7537a(((C1814p.b) it3.next()).f5910a);
                }
                z10 = true;
            }
        }
        Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            AbstractC1108u abstractC1108u = (AbstractC1108u) it4.next();
            C1814p c1814pM4869c = abstractC1108u.m4869c();
            if (!z11 || z9) {
                if (c1814pM4869c.m7535d()) {
                    c1814pM4869c.f5905n = 0L;
                } else {
                    c1814pM4869c.f5905n = jCurrentTimeMillis;
                }
            } else if (z8) {
                c1814pM4869c.f5893b = EnumC1106s.FAILED;
            } else if (z7) {
                c1814pM4869c.f5893b = EnumC1106s.CANCELLED;
            } else {
                c1814pM4869c.f5893b = EnumC1106s.BLOCKED;
            }
            if (c1814pM4869c.f5893b == EnumC1106s.ENQUEUED) {
                z10 = true;
            }
            workDatabaseM5173o.mo14518K().mo7544h(c1814pM4869c);
            if (z11) {
                int length = strArr2.length;
                int i7 = 0;
                while (i7 < length) {
                    workDatabaseM5173o.mo14513C().mo7511b(new C1799a(abstractC1108u.m4867a(), strArr2[i7]));
                    i7++;
                    strArr2 = strArr2;
                    it4 = it4;
                }
            }
            String[] strArr3 = strArr2;
            Iterator it5 = it4;
            Iterator it6 = abstractC1108u.m4868b().iterator();
            while (it6.hasNext()) {
                workDatabaseM5173o.mo14519L().mo7559a(new C1817s((String) it6.next(), abstractC1108u.m4867a()));
            }
            if (!zIsEmpty) {
                workDatabaseM5173o.mo14516I().mo7525a(new C1808j(str, abstractC1108u.m4867a()));
            }
            strArr2 = strArr3;
            it4 = it5;
        }
        return z10;
    }

    /* JADX INFO: renamed from: e */
    private static boolean m7965e(C1180g c1180g) {
        List<C1180g> listM5150e = c1180g.m5150e();
        boolean z7 = false;
        if (listM5150e != null) {
            boolean zM7965e = false;
            for (C1180g c1180g2 : listM5150e) {
                if (c1180g2.m5154j()) {
                    AbstractC1097j.m4844c().mo4851h(f6372c, String.format("Already enqueued work ids (%s).", TextUtils.join(", ", c1180g2.m5148c())), new Throwable[0]);
                } else {
                    zM7965e |= m7965e(c1180g2);
                }
            }
            z7 = zM7965e;
        }
        return m7963b(c1180g) | z7;
    }

    /* JADX INFO: renamed from: a */
    public boolean m7966a() {
        WorkDatabase workDatabaseM5173o = this.f6373a.m5152g().m5173o();
        workDatabaseM5173o.m33029e();
        try {
            boolean zM7965e = m7965e(this.f6373a);
            workDatabaseM5173o.m33042z();
            return zM7965e;
        } finally {
            workDatabaseM5173o.m33031i();
        }
    }

    /* JADX INFO: renamed from: d */
    public InterfaceC1100m m7967d() {
        return this.f6374b;
    }

    /* JADX INFO: renamed from: f */
    public void m7968f() {
        C1182i c1182iM5152g = this.f6373a.m5152g();
        AbstractC1179f.m5143b(c1182iM5152g.m5169i(), c1182iM5152g.m5173o(), c1182iM5152g.m5172n());
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.f6373a.m5153h()) {
                throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", this.f6373a));
            }
            if (m7966a()) {
                AbstractC1929g.m7977a(this.f6373a.m5152g().m5168h(), RescheduleReceiver.class, true);
                m7968f();
            }
            this.f6374b.m5124a(InterfaceC1100m.f3962a);
        } catch (Throwable th) {
            this.f6374b.m5124a(new InterfaceC1100m.b.a(th));
        }
    }
}
