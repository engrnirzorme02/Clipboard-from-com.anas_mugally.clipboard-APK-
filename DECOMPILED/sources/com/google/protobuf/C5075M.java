package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.M */
/* JADX INFO: loaded from: classes.dex */
public class C5075M {

    /* JADX INFO: renamed from: a */
    private final a f19338a;

    /* JADX INFO: renamed from: b */
    private final Object f19339b;

    /* JADX INFO: renamed from: c */
    private final Object f19340c;

    /* JADX INFO: renamed from: com.google.protobuf.M$a */
    static class a {

        /* JADX INFO: renamed from: a */
        public final AbstractC5062A0.b f19341a;

        /* JADX INFO: renamed from: b */
        public final Object f19342b;

        /* JADX INFO: renamed from: c */
        public final AbstractC5062A0.b f19343c;

        /* JADX INFO: renamed from: d */
        public final Object f19344d;

        public a(AbstractC5062A0.b bVar, Object obj, AbstractC5062A0.b bVar2, Object obj2) {
            this.f19341a = bVar;
            this.f19342b = obj;
            this.f19343c = bVar2;
            this.f19344d = obj2;
        }
    }

    private C5075M(AbstractC5062A0.b bVar, Object obj, AbstractC5062A0.b bVar2, Object obj2) {
        this.f19338a = new a(bVar, obj, bVar2, obj2);
        this.f19339b = obj;
        this.f19340c = obj2;
    }

    /* JADX INFO: renamed from: b */
    static int m22937b(a aVar, Object obj, Object obj2) {
        return C5128u.m23593b(aVar.f19341a, 1, obj) + C5128u.m23593b(aVar.f19343c, 2, obj2);
    }

    /* JADX INFO: renamed from: d */
    public static C5075M m22938d(AbstractC5062A0.b bVar, Object obj, AbstractC5062A0.b bVar2, Object obj2) {
        return new C5075M(bVar, obj, bVar2, obj2);
    }

    /* JADX INFO: renamed from: e */
    static void m22939e(AbstractC5110l abstractC5110l, a aVar, Object obj, Object obj2) {
        C5128u.m23603u(abstractC5110l, aVar.f19341a, 1, obj);
        C5128u.m23603u(abstractC5110l, aVar.f19343c, 2, obj2);
    }

    /* JADX INFO: renamed from: a */
    public int m22940a(int i7, Object obj, Object obj2) {
        return AbstractC5110l.m23353Q(i7) + AbstractC5110l.m23337A(m22937b(this.f19338a, obj, obj2));
    }

    /* JADX INFO: renamed from: c */
    a m22941c() {
        return this.f19338a;
    }
}
