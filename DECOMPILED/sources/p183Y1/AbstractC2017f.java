package p183Y1;

/* JADX INFO: renamed from: Y1.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2017f {

    /* JADX INFO: renamed from: Y1.f$a */
    class a implements b {

        /* JADX INFO: renamed from: a */
        private volatile Object f6697a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ b f6698b;

        a(b bVar) {
            this.f6698b = bVar;
        }

        @Override // p183Y1.AbstractC2017f.b
        public Object get() {
            if (this.f6697a == null) {
                synchronized (this) {
                    try {
                        if (this.f6697a == null) {
                            this.f6697a = AbstractC2022k.m8408e(this.f6698b.get());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return this.f6697a;
        }
    }

    /* JADX INFO: renamed from: Y1.f$b */
    public interface b {
        Object get();
    }

    /* JADX INFO: renamed from: a */
    public static b m8391a(b bVar) {
        return new a(bVar);
    }
}
