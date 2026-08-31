package p193Z4;

import android.content.Context;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p054G4.AbstractC0485d;
import p054G4.C0484c;
import p145S5.C1444v;
import p206b0.AbstractC2924f;
import p206b0.AbstractC2927i;
import p206b0.C2921c;
import p238e6.InterfaceC5367l;
import p283k3.AbstractC6029L;

/* JADX INFO: renamed from: Z4.p */
/* JADX INFO: loaded from: classes.dex */
class C2164p {

    /* JADX INFO: renamed from: b */
    private static final AbstractC2924f.a f7025b = AbstractC2927i.m14680f("fire-global");

    /* JADX INFO: renamed from: c */
    private static final AbstractC2924f.a f7026c = AbstractC2927i.m14680f("fire-count");

    /* JADX INFO: renamed from: d */
    private static final AbstractC2924f.a f7027d = AbstractC2927i.m14681g("last-used-date");

    /* JADX INFO: renamed from: a */
    private final C0484c f7028a;

    public C2164p(Context context, String str) {
        this.f7028a = new C0484c(context, "FirebaseHeartBeat" + str);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C1444v m8768a(long j7, C2921c c2921c) {
        c2921c.m14659i(f7025b, Long.valueOf(j7));
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C1444v m8769b(C2164p c2164p, String str, String str2, AbstractC2924f.a aVar, C2921c c2921c) {
        c2164p.getClass();
        AbstractC2924f.a aVar2 = f7027d;
        if (((String) AbstractC0485d.m2084a(c2921c, aVar2, "")).equals(str)) {
            AbstractC2924f.a aVarM8774i = c2164p.m8774i(c2921c, str);
            if (aVarM8774i == null || aVarM8774i.m14668a().equals(str2)) {
                return null;
            }
            c2164p.m8776q(c2921c, aVar, str);
            return null;
        }
        AbstractC2924f.a aVar3 = f7026c;
        long jLongValue = ((Long) AbstractC0485d.m2084a(c2921c, aVar3, 0L)).longValue();
        if (jLongValue + 1 == 30) {
            jLongValue = c2164p.m8772e(c2921c);
        }
        HashSet hashSet = new HashSet((Collection) AbstractC0485d.m2084a(c2921c, aVar, new HashSet()));
        hashSet.add(str);
        c2921c.m14659i(aVar, hashSet);
        c2921c.m14659i(aVar3, Long.valueOf(jLongValue + 1));
        c2921c.m14659i(aVar2, str);
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ C1444v m8770c(C2164p c2164p, C2921c c2921c) {
        c2164p.getClass();
        long j7 = 0;
        for (Map.Entry entry : c2921c.mo14653a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                AbstractC2924f.a aVar = (AbstractC2924f.a) entry.getKey();
                Set set = (Set) entry.getValue();
                String strM8773h = c2164p.m8773h(System.currentTimeMillis());
                if (set.contains(strM8773h)) {
                    c2921c.m14659i(aVar, AbstractC6029L.m27048a(new Object[]{strM8773h}));
                    j7++;
                } else {
                    c2921c.m14658h(aVar);
                }
            }
        }
        if (j7 == 0) {
            c2921c.m14658h(f7026c);
            return null;
        }
        c2921c.m14659i(f7026c, Long.valueOf(j7));
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ C1444v m8771d(C2164p c2164p, String str, C2921c c2921c) {
        c2164p.getClass();
        c2921c.m14659i(f7027d, str);
        c2164p.m8775l(c2921c, str);
        return null;
    }

    /* JADX INFO: renamed from: e */
    private synchronized long m8772e(C2921c c2921c) {
        long j7;
        try {
            long jLongValue = ((Long) AbstractC0485d.m2084a(c2921c, f7026c, 0L)).longValue();
            String strM14668a = "";
            Set hashSet = new HashSet();
            String str = null;
            for (Map.Entry entry : c2921c.mo14653a().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set<String> set = (Set) entry.getValue();
                    for (String str2 : set) {
                        if (str == null || str.compareTo(str2) > 0) {
                            strM14668a = ((AbstractC2924f.a) entry.getKey()).m14668a();
                            hashSet = set;
                            str = str2;
                        }
                    }
                }
            }
            HashSet hashSet2 = new HashSet(hashSet);
            hashSet2.remove(str);
            c2921c.m14659i(AbstractC2927i.m14682h(strM14668a), hashSet2);
            j7 = jLongValue - 1;
            c2921c.m14659i(f7026c, Long.valueOf(j7));
        } catch (Throwable th) {
            throw th;
        }
        return j7;
    }

    /* JADX INFO: renamed from: h */
    private synchronized String m8773h(long j7) {
        return new Date(j7).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    /* JADX INFO: renamed from: i */
    private synchronized AbstractC2924f.a m8774i(C2921c c2921c, String str) {
        for (Map.Entry entry : c2921c.mo14653a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return AbstractC2927i.m14682h(((AbstractC2924f.a) entry.getKey()).m14668a());
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    private synchronized void m8775l(C2921c c2921c, String str) {
        try {
            AbstractC2924f.a aVarM8774i = m8774i(c2921c, str);
            if (aVarM8774i == null) {
                return;
            }
            HashSet hashSet = new HashSet((Collection) AbstractC0485d.m2084a(c2921c, aVarM8774i, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                c2921c.m14658h(aVarM8774i);
            } else {
                c2921c.m14659i(aVarM8774i, hashSet);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: q */
    private synchronized void m8776q(C2921c c2921c, AbstractC2924f.a aVar, String str) {
        m8775l(c2921c, str);
        HashSet hashSet = new HashSet((Collection) AbstractC0485d.m2084a(c2921c, aVar, new HashSet()));
        hashSet.add(str);
        c2921c.m14659i(aVar, hashSet);
    }

    /* JADX INFO: renamed from: f */
    synchronized void m8777f() {
        this.f7028a.m2074g(new InterfaceC5367l() { // from class: Z4.m
            @Override // p238e6.InterfaceC5367l
            public final Object invoke(Object obj) {
                return C2164p.m8770c(this.f7021a, (C2921c) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    synchronized List m8778g() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            String strM8773h = m8773h(System.currentTimeMillis());
            for (Map.Entry entry : this.f7028a.m2075h().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(strM8773h);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(AbstractC2165q.m8785a(((AbstractC2924f.a) entry.getKey()).m14668a(), new ArrayList(hashSet)));
                    }
                }
            }
            m8784p(System.currentTimeMillis());
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: j */
    synchronized boolean m8779j(long j7, long j8) {
        return m8773h(j7).equals(m8773h(j8));
    }

    /* JADX INFO: renamed from: k */
    synchronized void m8780k() {
        final String strM8773h = m8773h(System.currentTimeMillis());
        this.f7028a.m2074g(new InterfaceC5367l() { // from class: Z4.n
            @Override // p238e6.InterfaceC5367l
            public final Object invoke(Object obj) {
                return C2164p.m8771d(this.f7022a, strM8773h, (C2921c) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    synchronized boolean m8781m(long j7) {
        return m8782n(f7025b, j7);
    }

    /* JADX INFO: renamed from: n */
    synchronized boolean m8782n(AbstractC2924f.a aVar, long j7) {
        if (m8779j(((Long) this.f7028a.m2076j(aVar, -1L)).longValue(), j7)) {
            return false;
        }
        this.f7028a.m2077k(aVar, Long.valueOf(j7));
        return true;
    }

    /* JADX INFO: renamed from: o */
    synchronized void m8783o(long j7, final String str) {
        final String strM8773h = m8773h(j7);
        final AbstractC2924f.a aVarM14682h = AbstractC2927i.m14682h(str);
        this.f7028a.m2074g(new InterfaceC5367l() { // from class: Z4.l
            @Override // p238e6.InterfaceC5367l
            public final Object invoke(Object obj) {
                return C2164p.m8769b(this.f7017a, strM8773h, str, aVarM14682h, (C2921c) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    synchronized void m8784p(final long j7) {
        this.f7028a.m2074g(new InterfaceC5367l() { // from class: Z4.o
            @Override // p238e6.InterfaceC5367l
            public final Object invoke(Object obj) {
                return C2164p.m8768a(j7, (C2921c) obj);
            }
        });
    }
}
