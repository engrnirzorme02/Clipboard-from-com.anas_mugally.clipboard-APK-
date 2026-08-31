package p188Z;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.jvm.internal.AbstractC6087b;
import kotlin.coroutines.jvm.internal.AbstractC6089d;
import kotlin.coroutines.jvm.internal.AbstractC6097l;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import kotlin.jvm.internal.AbstractC6119o;
import p145S5.AbstractC1430h;
import p145S5.AbstractC1437o;
import p145S5.C1444v;
import p145S5.InterfaceC1429g;
import p152T5.AbstractC1638q;
import p173W5.InterfaceC1875e;
import p174X.InterfaceC1903g;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5356a;
import p238e6.InterfaceC5371p;
import p238e6.InterfaceC5372q;

/* JADX INFO: renamed from: Z.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2062a implements InterfaceC1903g {

    /* JADX INFO: renamed from: a */
    private final InterfaceC5371p f6788a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC5372q f6789b;

    /* JADX INFO: renamed from: c */
    private final Context f6790c;

    /* JADX INFO: renamed from: d */
    private final String f6791d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC1429g f6792e;

    /* JADX INFO: renamed from: f */
    private final Set f6793f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: Z.a$a */
    public static final class a extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f6794a;

        a(InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return new a(interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, InterfaceC1875e interfaceC1875e) {
            return ((a) create(obj, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            AbstractC2005b.m8369e();
            if (this.f6794a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1437o.m6082b(obj);
            return AbstractC6087b.m27120a(true);
        }
    }

    /* JADX INFO: renamed from: Z.a$b */
    static final class b extends AbstractC6119o implements InterfaceC5356a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f6795a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f6796b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, String str) {
            super(0);
            this.f6795a = context;
            this.f6796b = str;
        }

        @Override // p238e6.InterfaceC5356a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SharedPreferences invoke() {
            SharedPreferences sharedPreferences = this.f6795a.getSharedPreferences(this.f6796b, 0);
            AbstractC6118n.m27186d(sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
            return sharedPreferences;
        }
    }

    /* JADX INFO: renamed from: Z.a$c */
    private static final class c {

        /* JADX INFO: renamed from: a */
        public static final c f6797a = new c();

        private c() {
        }

        /* JADX INFO: renamed from: a */
        public static final boolean m8533a(Context context, String name) {
            AbstractC6118n.m27187e(context, "context");
            AbstractC6118n.m27187e(name, "name");
            return context.deleteSharedPreferences(name);
        }
    }

    /* JADX INFO: renamed from: Z.a$d */
    static final class d extends AbstractC6089d {

        /* JADX INFO: renamed from: a */
        Object f6798a;

        /* JADX INFO: renamed from: b */
        /* synthetic */ Object f6799b;

        /* JADX INFO: renamed from: d */
        int f6801d;

        d(InterfaceC1875e interfaceC1875e) {
            super(interfaceC1875e);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            this.f6799b = obj;
            this.f6801d |= Integer.MIN_VALUE;
            return C2062a.this.mo7841a(null, this);
        }
    }

    private C2062a(InterfaceC5356a interfaceC5356a, Set set, InterfaceC5371p interfaceC5371p, InterfaceC5372q interfaceC5372q, Context context, String str) {
        this.f6788a = interfaceC5371p;
        this.f6789b = interfaceC5372q;
        this.f6790c = context;
        this.f6791d = str;
        this.f6792e = AbstractC1430h.m6066b(interfaceC5356a);
        this.f6793f = set == AbstractC2063b.m8534a() ? null : AbstractC1638q.m6597k0(set);
    }

    /* JADX INFO: renamed from: d */
    private final void m8529d(Context context, String str) {
        c.m8533a(context, str);
    }

    /* JADX INFO: renamed from: e */
    private final SharedPreferences m8530e() {
        return (SharedPreferences) this.f6792e.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p174X.InterfaceC1903g
    /* JADX INFO: renamed from: a */
    public Object mo7841a(Object obj, InterfaceC1875e interfaceC1875e) {
        d dVar;
        C2062a c2062a;
        if (interfaceC1875e instanceof d) {
            dVar = (d) interfaceC1875e;
            int i7 = dVar.f6801d;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                dVar.f6801d = i7 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC1875e);
            }
        } else {
            dVar = new d(interfaceC1875e);
        }
        Object objInvoke = dVar.f6799b;
        Object objE = AbstractC2005b.m8369e();
        int i8 = dVar.f6801d;
        boolean z7 = true;
        if (i8 == 0) {
            AbstractC1437o.m6082b(objInvoke);
            InterfaceC5371p interfaceC5371p = this.f6788a;
            dVar.f6798a = this;
            dVar.f6801d = 1;
            objInvoke = interfaceC5371p.invoke(obj, dVar);
            if (objInvoke == objE) {
                return objE;
            }
            c2062a = this;
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2062a = (C2062a) dVar.f6798a;
            AbstractC1437o.m6082b(objInvoke);
        }
        if (!((Boolean) objInvoke).booleanValue()) {
            return AbstractC6087b.m27120a(false);
        }
        Set set = c2062a.f6793f;
        if (set == null) {
            Map<String, ?> all = c2062a.m8530e().getAll();
            AbstractC6118n.m27186d(all, "sharedPrefs.all");
            if (all.isEmpty()) {
                z7 = false;
            }
        } else {
            SharedPreferences sharedPreferencesM8530e = c2062a.m8530e();
            if (set == null || !set.isEmpty()) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    if (sharedPreferencesM8530e.contains((String) it.next())) {
                    }
                }
                z7 = false;
            } else {
                z7 = false;
            }
        }
        return AbstractC6087b.m27120a(z7);
    }

    @Override // p174X.InterfaceC1903g
    /* JADX INFO: renamed from: b */
    public Object mo7842b(InterfaceC1875e interfaceC1875e) throws IOException {
        Context context;
        String str;
        SharedPreferences.Editor editorEdit = m8530e().edit();
        Set set = this.f6793f;
        if (set == null) {
            editorEdit.clear();
        } else {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                editorEdit.remove((String) it.next());
            }
        }
        if (!editorEdit.commit()) {
            throw new IOException("Unable to delete migrated keys from SharedPreferences.");
        }
        if (m8530e().getAll().isEmpty() && (context = this.f6790c) != null && (str = this.f6791d) != null) {
            m8529d(context, str);
        }
        Set set2 = this.f6793f;
        if (set2 != null) {
            set2.clear();
        }
        return C1444v.f4971a;
    }

    @Override // p174X.InterfaceC1903g
    /* JADX INFO: renamed from: c */
    public Object mo7843c(Object obj, InterfaceC1875e interfaceC1875e) {
        return this.f6789b.mo7830j(new C2064c(m8530e(), this.f6793f), obj, interfaceC1875e);
    }

    public /* synthetic */ C2062a(Context context, String str, Set set, InterfaceC5371p interfaceC5371p, InterfaceC5372q interfaceC5372q, int i7, AbstractC6112h abstractC6112h) {
        this(context, str, (i7 & 4) != 0 ? AbstractC2063b.m8534a() : set, (i7 & 8) != 0 ? new a(null) : interfaceC5371p, interfaceC5372q);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2062a(Context context, String sharedPreferencesName, Set keysToMigrate, InterfaceC5371p shouldRunMigration, InterfaceC5372q migrate) {
        this(new b(context, sharedPreferencesName), keysToMigrate, shouldRunMigration, migrate, context, sharedPreferencesName);
        AbstractC6118n.m27187e(context, "context");
        AbstractC6118n.m27187e(sharedPreferencesName, "sharedPreferencesName");
        AbstractC6118n.m27187e(keysToMigrate, "keysToMigrate");
        AbstractC6118n.m27187e(shouldRunMigration, "shouldRunMigration");
        AbstractC6118n.m27187e(migrate, "migrate");
    }
}
