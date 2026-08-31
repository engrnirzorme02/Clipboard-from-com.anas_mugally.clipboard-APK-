package com.google.firebase.firestore;

import java.util.Map;
import p158U4.C1687k;
import p158U4.InterfaceC1684h;
import p186Y4.AbstractC2051s;

/* JADX INFO: renamed from: com.google.firebase.firestore.j */
/* JADX INFO: loaded from: classes.dex */
public class C4924j {

    /* JADX INFO: renamed from: a */
    private final FirebaseFirestore f18675a;

    /* JADX INFO: renamed from: b */
    private final C1687k f18676b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC1684h f18677c;

    /* JADX INFO: renamed from: d */
    private final C4938x f18678d;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 com.google.firebase.firestore.j$a, still in use, count: 1, list:
      (r0v0 com.google.firebase.firestore.j$a) from 0x0024: SPUT (r0v0 com.google.firebase.firestore.j$a) com.google.firebase.firestore.j.a.d com.google.firebase.firestore.j$a
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: renamed from: com.google.firebase.firestore.j$a */
    public static final class a {
        NONE,
        ESTIMATE,
        PREVIOUS;


        /* JADX INFO: renamed from: d */
        static final a f18682d = new a();

        static {
        }

        private a() {
            super(str, i);
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f18683e.clone();
        }
    }

    C4924j(FirebaseFirestore firebaseFirestore, C1687k c1687k, InterfaceC1684h interfaceC1684h, boolean z7, boolean z8) {
        this.f18675a = (FirebaseFirestore) AbstractC2051s.m8520a(firebaseFirestore);
        this.f18676b = (C1687k) AbstractC2051s.m8520a(c1687k);
        this.f18677c = interfaceC1684h;
        this.f18678d = new C4938x(z8, z7);
    }

    /* JADX INFO: renamed from: b */
    static C4924j m22165b(FirebaseFirestore firebaseFirestore, InterfaceC1684h interfaceC1684h, boolean z7, boolean z8) {
        return new C4924j(firebaseFirestore, interfaceC1684h.getKey(), interfaceC1684h, z7, z8);
    }

    /* JADX INFO: renamed from: c */
    static C4924j m22166c(FirebaseFirestore firebaseFirestore, C1687k c1687k, boolean z7) {
        return new C4924j(firebaseFirestore, c1687k, null, z7, false);
    }

    /* JADX INFO: renamed from: a */
    public boolean m22167a() {
        return this.f18677c != null;
    }

    /* JADX INFO: renamed from: d */
    public Map m22168d() {
        return m22169e(a.f18682d);
    }

    /* JADX INFO: renamed from: e */
    public Map m22169e(a aVar) {
        AbstractC2051s.m8521b(aVar, "Provided serverTimestampBehavior value must not be null.");
        C4912A c4912a = new C4912A(this.f18675a, aVar);
        InterfaceC1684h interfaceC1684h = this.f18677c;
        if (interfaceC1684h == null) {
            return null;
        }
        return c4912a.m22138b(interfaceC1684h.getData().m7144h());
    }

    public boolean equals(Object obj) {
        InterfaceC1684h interfaceC1684h;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4924j)) {
            return false;
        }
        C4924j c4924j = (C4924j) obj;
        return this.f18675a.equals(c4924j.f18675a) && this.f18676b.equals(c4924j.f18676b) && this.f18678d.equals(c4924j.f18678d) && ((interfaceC1684h = this.f18677c) != null ? !(c4924j.f18677c == null || !interfaceC1684h.getData().equals(c4924j.f18677c.getData())) : c4924j.f18677c == null);
    }

    /* JADX INFO: renamed from: f */
    public C4938x m22170f() {
        return this.f18678d;
    }

    public int hashCode() {
        int iHashCode = ((this.f18675a.hashCode() * 31) + this.f18676b.hashCode()) * 31;
        InterfaceC1684h interfaceC1684h = this.f18677c;
        int iHashCode2 = (iHashCode + (interfaceC1684h != null ? interfaceC1684h.getKey().hashCode() : 0)) * 31;
        InterfaceC1684h interfaceC1684h2 = this.f18677c;
        return ((iHashCode2 + (interfaceC1684h2 != null ? interfaceC1684h2.getData().hashCode() : 0)) * 31) + this.f18678d.hashCode();
    }

    public String toString() {
        return "DocumentSnapshot{key=" + this.f18676b + ", metadata=" + this.f18678d + ", doc=" + this.f18677c + '}';
    }
}
