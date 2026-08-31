package p196a0;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.jvm.internal.AbstractC6087b;
import kotlin.coroutines.jvm.internal.AbstractC6097l;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.AbstractC1437o;
import p145S5.C1444v;
import p152T5.AbstractC1638q;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p188Z.C2062a;
import p188Z.C2064c;
import p206b0.AbstractC2924f;
import p206b0.AbstractC2927i;
import p206b0.C2921c;
import p238e6.InterfaceC5371p;
import p238e6.InterfaceC5372q;

/* JADX INFO: renamed from: a0.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2181i {

    /* JADX INFO: renamed from: a */
    private static final Set f7057a = new LinkedHashSet();

    /* JADX INFO: renamed from: a0.i$a */
    static final class a extends AbstractC6097l implements InterfaceC5372q {

        /* JADX INFO: renamed from: a */
        int f7058a;

        /* JADX INFO: renamed from: b */
        /* synthetic */ Object f7059b;

        /* JADX INFO: renamed from: c */
        /* synthetic */ Object f7060c;

        a(InterfaceC1875e interfaceC1875e) {
            super(3, interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5372q
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object mo7830j(C2064c c2064c, AbstractC2924f abstractC2924f, InterfaceC1875e interfaceC1875e) {
            a aVar = new a(interfaceC1875e);
            aVar.f7059b = c2064c;
            aVar.f7060c = abstractC2924f;
            return aVar.invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            AbstractC2005b.m8369e();
            if (this.f7058a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1437o.m6082b(obj);
            C2064c c2064c = (C2064c) this.f7059b;
            AbstractC2924f abstractC2924f = (AbstractC2924f) this.f7060c;
            Set setKeySet = abstractC2924f.mo14653a().keySet();
            ArrayList arrayList = new ArrayList(AbstractC1638q.m6774s(setKeySet, 10));
            Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(((AbstractC2924f.a) it.next()).m14668a());
            }
            Map mapM8535a = c2064c.m8535a();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : mapM8535a.entrySet()) {
                if (!arrayList.contains((String) entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            C2921c c2921cM14666c = abstractC2924f.m14666c();
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str = (String) entry2.getKey();
                Object value = entry2.getValue();
                if (value instanceof Boolean) {
                    c2921cM14666c.m14659i(AbstractC2927i.m14675a(str), value);
                } else if (value instanceof Float) {
                    c2921cM14666c.m14659i(AbstractC2927i.m14678d(str), value);
                } else if (value instanceof Integer) {
                    c2921cM14666c.m14659i(AbstractC2927i.m14679e(str), value);
                } else if (value instanceof Long) {
                    c2921cM14666c.m14659i(AbstractC2927i.m14680f(str), value);
                } else if (value instanceof String) {
                    c2921cM14666c.m14659i(AbstractC2927i.m14681g(str), value);
                } else if (value instanceof Set) {
                    AbstractC2924f.a aVarM14682h = AbstractC2927i.m14682h(str);
                    AbstractC6118n.m27185c(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                    c2921cM14666c.m14659i(aVarM14682h, (Set) value);
                }
            }
            return c2921cM14666c.m14667d();
        }
    }

    /* JADX INFO: renamed from: a0.i$b */
    static final class b extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f7061a;

        /* JADX INFO: renamed from: b */
        /* synthetic */ Object f7062b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Set f7063c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Set set, InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
            this.f7063c = set;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            b bVar = new b(this.f7063c, interfaceC1875e);
            bVar.f7062b = obj;
            return bVar;
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC2924f abstractC2924f, InterfaceC1875e interfaceC1875e) {
            return ((b) create(abstractC2924f, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            AbstractC2005b.m8369e();
            if (this.f7061a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1437o.m6082b(obj);
            Set setKeySet = ((AbstractC2924f) this.f7062b).mo14653a().keySet();
            ArrayList arrayList = new ArrayList(AbstractC1638q.m6774s(setKeySet, 10));
            Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(((AbstractC2924f.a) it.next()).m14668a());
            }
            boolean z7 = true;
            if (this.f7063c != AbstractC2181i.m8862c()) {
                Set set = this.f7063c;
                if (set == null || !set.isEmpty()) {
                    Iterator it2 = set.iterator();
                    while (it2.hasNext()) {
                        if (!arrayList.contains((String) it2.next())) {
                        }
                    }
                    z7 = false;
                } else {
                    z7 = false;
                }
            }
            return AbstractC6087b.m27120a(z7);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final C2062a m8860a(Context context, String sharedPreferencesName, Set keysToMigrate) {
        AbstractC6118n.m27187e(context, "context");
        AbstractC6118n.m27187e(sharedPreferencesName, "sharedPreferencesName");
        AbstractC6118n.m27187e(keysToMigrate, "keysToMigrate");
        if (keysToMigrate != f7057a) {
            return new C2062a(context, sharedPreferencesName, keysToMigrate, m8864e(keysToMigrate), m8863d());
        }
        return new C2062a(context, sharedPreferencesName, null, m8864e(keysToMigrate), m8863d(), 4, null);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C2062a m8861b(Context context, String str, Set set, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            set = f7057a;
        }
        return m8860a(context, str, set);
    }

    /* JADX INFO: renamed from: c */
    public static final Set m8862c() {
        return f7057a;
    }

    /* JADX INFO: renamed from: d */
    private static final InterfaceC5372q m8863d() {
        return new a(null);
    }

    /* JADX INFO: renamed from: e */
    private static final InterfaceC5371p m8864e(Set set) {
        return new b(set, null);
    }
}
