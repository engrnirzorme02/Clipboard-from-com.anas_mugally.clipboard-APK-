package p374v4;

/* JADX INFO: renamed from: v4.y */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC7260y {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC7260y f29044a = new a();

    /* JADX INFO: renamed from: v4.y$a */
    class a implements InterfaceC7260y {
        a() {
        }

        @Override // p374v4.InterfaceC7260y
        /* JADX INFO: renamed from: a */
        public void mo32186a(Thread thread, String str) {
            thread.setName(str);
        }

        @Override // p374v4.InterfaceC7260y
        /* JADX INFO: renamed from: b */
        public void mo32187b(Thread thread, boolean z7) {
            thread.setDaemon(z7);
        }

        @Override // p374v4.InterfaceC7260y
        /* JADX INFO: renamed from: c */
        public void mo32188c(Thread thread, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            thread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
        }
    }

    /* JADX INFO: renamed from: a */
    void mo32186a(Thread thread, String str);

    /* JADX INFO: renamed from: b */
    void mo32187b(Thread thread, boolean z7);

    /* JADX INFO: renamed from: c */
    void mo32188c(Thread thread, Thread.UncaughtExceptionHandler uncaughtExceptionHandler);
}
