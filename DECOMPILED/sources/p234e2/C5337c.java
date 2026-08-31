package p234e2;

/* JADX INFO: renamed from: e2.c */
/* JADX INFO: loaded from: classes.dex */
public final class C5337c implements InterfaceC5336b {

    /* JADX INFO: renamed from: b */
    private static final C5337c f20444b = new C5337c(null);

    /* JADX INFO: renamed from: a */
    private final Object f20445a;

    private C5337c(Object obj) {
        this.f20445a = obj;
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC5336b m24327a(Object obj) {
        return new C5337c(AbstractC5338d.m24330c(obj, "instance cannot be null"));
    }

    @Override // p138R5.InterfaceC1380a
    public Object get() {
        return this.f20445a;
    }
}
