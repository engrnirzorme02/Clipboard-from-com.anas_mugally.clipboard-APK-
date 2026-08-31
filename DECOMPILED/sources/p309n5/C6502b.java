package p309n5;

import android.util.Log;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.jvm.internal.AbstractC6089d;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p173W5.InterfaceC1875e;
import p392x6.AbstractC7425g;
import p392x6.InterfaceC7419a;

/* JADX INFO: renamed from: n5.b */
/* JADX INFO: loaded from: classes.dex */
public final class C6502b {

    /* JADX INFO: renamed from: a */
    public static final C6502b f24586a = new C6502b();

    /* JADX INFO: renamed from: b */
    private static final Map f24587b = Collections.synchronizedMap(new LinkedHashMap());

    /* JADX INFO: renamed from: n5.b$a */
    private static final class a {

        /* JADX INFO: renamed from: a */
        private final InterfaceC7419a f24588a;

        /* JADX INFO: renamed from: b */
        private InterfaceC6503c f24589b;

        public a(InterfaceC7419a mutex, InterfaceC6503c interfaceC6503c) {
            AbstractC6118n.m27187e(mutex, "mutex");
            this.f24588a = mutex;
            this.f24589b = interfaceC6503c;
        }

        /* JADX INFO: renamed from: a */
        public final InterfaceC7419a m27682a() {
            return this.f24588a;
        }

        /* JADX INFO: renamed from: b */
        public final InterfaceC6503c m27683b() {
            return this.f24589b;
        }

        /* JADX INFO: renamed from: c */
        public final void m27684c(InterfaceC6503c interfaceC6503c) {
            this.f24589b = interfaceC6503c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC6118n.m27183a(this.f24588a, aVar.f24588a) && AbstractC6118n.m27183a(this.f24589b, aVar.f24589b);
        }

        public int hashCode() {
            int iHashCode = this.f24588a.hashCode() * 31;
            InterfaceC6503c interfaceC6503c = this.f24589b;
            return iHashCode + (interfaceC6503c == null ? 0 : interfaceC6503c.hashCode());
        }

        public String toString() {
            return "Dependency(mutex=" + this.f24588a + ", subscriber=" + this.f24589b + ')';
        }

        public /* synthetic */ a(InterfaceC7419a interfaceC7419a, InterfaceC6503c interfaceC6503c, int i7, AbstractC6112h abstractC6112h) {
            this(interfaceC7419a, (i7 & 2) != 0 ? null : interfaceC6503c);
        }
    }

    /* JADX INFO: renamed from: n5.b$b */
    static final class b extends AbstractC6089d {

        /* JADX INFO: renamed from: a */
        Object f24590a;

        /* JADX INFO: renamed from: b */
        Object f24591b;

        /* JADX INFO: renamed from: c */
        Object f24592c;

        /* JADX INFO: renamed from: d */
        Object f24593d;

        /* JADX INFO: renamed from: e */
        Object f24594e;

        /* JADX INFO: renamed from: f */
        Object f24595f;

        /* JADX INFO: renamed from: r */
        /* synthetic */ Object f24596r;

        /* JADX INFO: renamed from: t */
        int f24598t;

        b(InterfaceC1875e interfaceC1875e) {
            super(interfaceC1875e);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            this.f24596r = obj;
            this.f24598t |= Integer.MIN_VALUE;
            return C6502b.this.m27680c(this);
        }
    }

    private C6502b() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m27677a(InterfaceC6503c.a subscriberName) {
        AbstractC6118n.m27187e(subscriberName, "subscriberName");
        Map dependencies = f24587b;
        if (dependencies.containsKey(subscriberName)) {
            Log.d("FirebaseSessions", "Dependency " + subscriberName + " already added.");
            return;
        }
        AbstractC6118n.m27186d(dependencies, "dependencies");
        dependencies.put(subscriberName, new a(AbstractC7425g.m32876a(true), null, 2, 0 == true ? 1 : 0));
        Log.d("FirebaseSessions", "Dependency to " + subscriberName + " added.");
    }

    /* JADX INFO: renamed from: b */
    private final a m27678b(InterfaceC6503c.a aVar) {
        Map dependencies = f24587b;
        AbstractC6118n.m27186d(dependencies, "dependencies");
        Object obj = dependencies.get(aVar);
        if (obj != null) {
            AbstractC6118n.m27186d(obj, "getOrElse(...)");
            return (a) obj;
        }
        throw new IllegalStateException("Cannot get dependency " + aVar + ". Dependencies should be added at class load time.");
    }

    /* JADX INFO: renamed from: e */
    public static final void m27679e(InterfaceC6503c subscriber) {
        AbstractC6118n.m27187e(subscriber, "subscriber");
        InterfaceC6503c.a aVarMo24820c = subscriber.mo24820c();
        a aVarM27678b = f24586a.m27678b(aVarMo24820c);
        if (aVarM27678b.m27683b() != null) {
            Log.d("FirebaseSessions", "Subscriber " + aVarMo24820c + " already registered.");
            return;
        }
        aVarM27678b.m27684c(subscriber);
        Log.d("FirebaseSessions", "Subscriber " + aVarMo24820c + " registered.");
        InterfaceC7419a.a.m32858b(aVarM27678b.m27682a(), null, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x006f  */
    /* JADX WARN: Code duplicated, block: B:19:0x009e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x009f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x009f -> B:27:0x00a0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: c */
    public final java.lang.Object m27680c(p173W5.InterfaceC1875e r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof p309n5.C6502b.b
            if (r0 == 0) goto L13
            r0 = r11
            n5.b$b r0 = (p309n5.C6502b.b) r0
            int r1 = r0.f24598t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24598t = r1
            goto L18
        L13:
            n5.b$b r0 = new n5.b$b
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f24596r
            java.lang.Object r1 = p180X5.AbstractC2005b.m8369e()
            int r2 = r0.f24598t
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L48
            if (r2 != r3) goto L40
            java.lang.Object r2 = r0.f24595f
            java.lang.Object r5 = r0.f24594e
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r6 = r0.f24593d
            x6.a r6 = (p392x6.InterfaceC7419a) r6
            java.lang.Object r7 = r0.f24592c
            n5.c$a r7 = (p309n5.InterfaceC6503c.a) r7
            java.lang.Object r8 = r0.f24591b
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r9 = r0.f24590a
            java.util.Map r9 = (java.util.Map) r9
            p145S5.AbstractC1437o.m6082b(r11)
            goto La0
        L40:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L48:
            p145S5.AbstractC1437o.m6082b(r11)
            java.util.Map r11 = p309n5.C6502b.f24587b
            java.lang.String r2 = "dependencies"
            kotlin.jvm.internal.AbstractC6118n.m27186d(r11, r2)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            int r5 = r11.size()
            int r5 = p152T5.AbstractC1610H.m6623e(r5)
            r2.<init>(r5)
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
            r8 = r11
            r5 = r2
        L69:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto Lb3
            java.lang.Object r11 = r8.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r2 = r11.getKey()
            java.lang.Object r6 = r11.getKey()
            r7 = r6
            n5.c$a r7 = (p309n5.InterfaceC6503c.a) r7
            java.lang.Object r11 = r11.getValue()
            n5.b$a r11 = (p309n5.C6502b.a) r11
            x6.a r6 = r11.m27682a()
            r0.f24590a = r5
            r0.f24591b = r8
            r0.f24592c = r7
            r0.f24593d = r6
            r0.f24594e = r5
            r0.f24595f = r2
            r0.f24598t = r3
            java.lang.Object r11 = r6.mo32856d(r4, r0)
            if (r11 != r1) goto L9f
            return r1
        L9f:
            r9 = r5
        La0:
            n5.b r11 = p309n5.C6502b.f24586a     // Catch: java.lang.Throwable -> Lae
            n5.c r11 = r11.m27681d(r7)     // Catch: java.lang.Throwable -> Lae
            r6.mo32855c(r4)
            r5.put(r2, r11)
            r5 = r9
            goto L69
        Lae:
            r11 = move-exception
            r6.mo32855c(r4)
            throw r11
        Lb3:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p309n5.C6502b.m27680c(W5.e):java.lang.Object");
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC6503c m27681d(InterfaceC6503c.a subscriberName) {
        AbstractC6118n.m27187e(subscriberName, "subscriberName");
        InterfaceC6503c interfaceC6503cM27683b = m27678b(subscriberName).m27683b();
        if (interfaceC6503cM27683b != null) {
            return interfaceC6503cM27683b;
        }
        throw new IllegalStateException("Subscriber " + subscriberName + " has not been registered.");
    }
}
