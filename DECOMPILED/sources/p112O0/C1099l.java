package p112O0;

import androidx.work.OverwritingInputMerger;

/* JADX INFO: renamed from: O0.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1099l extends AbstractC1108u {

    /* JADX INFO: renamed from: O0.l$a */
    public static final class a extends AbstractC1108u.a {
        public a(Class cls) {
            super(cls);
            this.f3981c.f5895d = OverwritingInputMerger.class.getName();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p112O0.AbstractC1108u.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public C1099l mo4853c() {
            if (this.f3979a && this.f3981c.f5901j.m4818h()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            return new C1099l(this);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p112O0.AbstractC1108u.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public a mo4854d() {
            return this;
        }
    }

    C1099l(a aVar) {
        super(aVar.f3980b, aVar.f3981c, aVar.f3982d);
    }

    /* JADX INFO: renamed from: d */
    public static C1099l m4852d(Class cls) {
        return (C1099l) new a(cls).m4871b();
    }
}
