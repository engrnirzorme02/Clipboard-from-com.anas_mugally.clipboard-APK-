package p301m5;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.installations.AbstractC4947g;
import kotlin.coroutines.jvm.internal.AbstractC6089d;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.AbstractC1437o;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p219c5.InterfaceC3022e;
import p400y6.AbstractC7555b;

/* JADX INFO: renamed from: m5.t */
/* JADX INFO: loaded from: classes.dex */
public final class C6392t {

    /* JADX INFO: renamed from: c */
    public static final a f24407c = new a(null);

    /* JADX INFO: renamed from: a */
    private final String f24408a;

    /* JADX INFO: renamed from: b */
    private final String f24409b;

    /* JADX INFO: renamed from: m5.t$a */
    public static final class a {

        /* JADX INFO: renamed from: m5.t$a$a, reason: collision with other inner class name */
        static final class C7715a extends AbstractC6089d {

            /* JADX INFO: renamed from: a */
            Object f24410a;

            /* JADX INFO: renamed from: b */
            /* synthetic */ Object f24411b;

            /* JADX INFO: renamed from: d */
            int f24413d;

            C7715a(InterfaceC1875e interfaceC1875e) {
                super(interfaceC1875e);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final Object invokeSuspend(Object obj) {
                this.f24411b = obj;
                this.f24413d |= Integer.MIN_VALUE;
                return a.this.m27508a(null, this);
            }
        }

        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
        
            if (r10 == r1) goto L33;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v17 */
        /* JADX WARN: Type inference failed for: r10v4 */
        /* JADX WARN: Type inference failed for: r10v5, types: [c5.e] */
        /* JADX WARN: Type inference failed for: r9v0, types: [c5.e, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v1 */
        /* JADX WARN: Type inference failed for: r9v14 */
        /* JADX WARN: Type inference failed for: r9v15 */
        /* JADX WARN: Type inference failed for: r9v16 */
        /* JADX WARN: Type inference failed for: r9v17 */
        /* JADX WARN: Type inference failed for: r9v18 */
        /* JADX WARN: Type inference failed for: r9v19 */
        /* JADX WARN: Type inference failed for: r9v2 */
        /* JADX WARN: Type inference failed for: r9v20 */
        /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r9v6 */
        /* JADX WARN: Type inference failed for: r9v7 */
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object m27508a(InterfaceC3022e interfaceC3022e, InterfaceC1875e interfaceC1875e) {
            C7715a c7715a;
            ?? r10;
            String str;
            ?? r9;
            if (interfaceC1875e instanceof C7715a) {
                c7715a = (C7715a) interfaceC1875e;
                int i7 = c7715a.f24413d;
                if ((i7 & Integer.MIN_VALUE) != 0) {
                    c7715a.f24413d = i7 - Integer.MIN_VALUE;
                } else {
                    c7715a = new C7715a(interfaceC1875e);
                }
            } else {
                c7715a = new C7715a(interfaceC1875e);
            }
            Object objM33253a = c7715a.f24411b;
            Object objE = AbstractC2005b.m8369e();
            int i8 = c7715a.f24413d;
            String str2 = "";
            try {
                try {
                    if (i8 == 0) {
                        AbstractC1437o.m6082b(objM33253a);
                        Task taskMo14992a = interfaceC3022e.mo14992a(false);
                        AbstractC6118n.m27186d(taskMo14992a, "getToken(...)");
                        c7715a.f24410a = interfaceC3022e;
                        c7715a.f24413d = 1;
                        objM33253a = AbstractC7555b.m33253a(taskMo14992a, c7715a);
                        interfaceC3022e = interfaceC3022e;
                        if (objM33253a == objE) {
                        }
                        return objE;
                    }
                    if (i8 == 1) {
                        InterfaceC3022e interfaceC3022e2 = (InterfaceC3022e) c7715a.f24410a;
                        AbstractC1437o.m6082b(objM33253a);
                        interfaceC3022e = interfaceC3022e2;
                    } else {
                        if (i8 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        String str3 = (String) c7715a.f24410a;
                        AbstractC1437o.m6082b(objM33253a);
                        interfaceC3022e = str3;
                    }
                    String str4 = (String) objM33253a;
                    r9 = interfaceC3022e;
                    if (str4 != null) {
                        str2 = str4;
                        r9 = interfaceC3022e;
                    }
                    return new C6392t(str2, r9, null);
                    String strMo22197b = ((AbstractC4947g) objM33253a).mo22197b();
                    r10 = interfaceC3022e;
                    str = strMo22197b;
                } catch (Exception e7) {
                    Log.w("FirebaseSessions", "Error getting authentication token.", e7);
                    r10 = interfaceC3022e;
                    str = "";
                }
                Task id = r10.getId();
                AbstractC6118n.m27186d(id, "getId(...)");
                c7715a.f24410a = str;
                c7715a.f24413d = 2;
                objM33253a = AbstractC7555b.m33253a(id, c7715a);
                interfaceC3022e = str;
            } catch (Exception e8) {
                Log.w("FirebaseSessions", "Error getting Firebase installation id .", e8);
                r9 = interfaceC3022e;
            }
        }

        private a() {
        }
    }

    public /* synthetic */ C6392t(String str, String str2, AbstractC6112h abstractC6112h) {
        this(str, str2);
    }

    /* JADX INFO: renamed from: a */
    public final String m27506a() {
        return this.f24409b;
    }

    /* JADX INFO: renamed from: b */
    public final String m27507b() {
        return this.f24408a;
    }

    private C6392t(String str, String str2) {
        this.f24408a = str;
        this.f24409b = str2;
    }
}
