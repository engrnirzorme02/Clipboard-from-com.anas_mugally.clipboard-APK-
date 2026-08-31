package p109N4;

/* JADX INFO: renamed from: N4.d */
/* JADX INFO: loaded from: classes.dex */
public @interface InterfaceC0973d {

    /* JADX INFO: renamed from: N4.d$a */
    public enum a {
        DEFAULT,
        SIGNED,
        FIXED
    }

    a intEncoding() default a.DEFAULT;

    int tag();
}
