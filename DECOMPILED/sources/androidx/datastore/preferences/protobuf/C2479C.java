package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.C */
/* JADX INFO: loaded from: classes.dex */
public class C2479C {

    /* JADX INFO: renamed from: a */
    private final a f9430a;

    /* JADX INFO: renamed from: b */
    private final Object f9431b;

    /* JADX INFO: renamed from: c */
    private final Object f9432c;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.C$a */
    static class a {

        /* JADX INFO: renamed from: a */
        public final AbstractC2523k0.b f9433a;

        /* JADX INFO: renamed from: b */
        public final Object f9434b;

        /* JADX INFO: renamed from: c */
        public final AbstractC2523k0.b f9435c;

        /* JADX INFO: renamed from: d */
        public final Object f9436d;

        public a(AbstractC2523k0.b bVar, Object obj, AbstractC2523k0.b bVar2, Object obj2) {
            this.f9433a = bVar;
            this.f9434b = obj;
            this.f9435c = bVar2;
            this.f9436d = obj2;
        }
    }

    private C2479C(AbstractC2523k0.b bVar, Object obj, AbstractC2523k0.b bVar2, Object obj2) {
        this.f9430a = new a(bVar, obj, bVar2, obj2);
        this.f9431b = obj;
        this.f9432c = obj2;
    }

    /* JADX INFO: renamed from: b */
    static int m10864b(a aVar, Object obj, Object obj2) {
        return C2530q.m11571b(aVar.f9433a, 1, obj) + C2530q.m11571b(aVar.f9435c, 2, obj2);
    }

    /* JADX INFO: renamed from: d */
    public static C2479C m10865d(AbstractC2523k0.b bVar, Object obj, AbstractC2523k0.b bVar2, Object obj2) {
        return new C2479C(bVar, obj, bVar2, obj2);
    }

    /* JADX INFO: renamed from: e */
    static void m10866e(AbstractC2518i abstractC2518i, a aVar, Object obj, Object obj2) {
        C2530q.m11581u(abstractC2518i, aVar.f9433a, 1, obj);
        C2530q.m11581u(abstractC2518i, aVar.f9435c, 2, obj2);
    }

    /* JADX INFO: renamed from: a */
    public int m10867a(int i7, Object obj, Object obj2) {
        return AbstractC2518i.m11308O(i7) + AbstractC2518i.m11339y(m10864b(this.f9430a, obj, obj2));
    }

    /* JADX INFO: renamed from: c */
    a m10868c() {
        return this.f9430a;
    }
}
