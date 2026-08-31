package p048F6;

import kotlin.jvm.internal.AbstractC6118n;
import p040E6.AbstractC0393b;
import p040E6.InterfaceC0396e;
import p408z6.InterfaceC7619e;

/* JADX INFO: renamed from: F6.u */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0460u {
    /* JADX INFO: renamed from: a */
    public static final void m1988a(AbstractC0393b json, InterfaceC0451l writer, InterfaceC7619e serializer, Object obj) {
        AbstractC6118n.m27187e(json, "json");
        AbstractC6118n.m27187e(writer, "writer");
        AbstractC6118n.m27187e(serializer, "serializer");
        new C0464y(writer, json, EnumC0438D.OBJ, new InterfaceC0396e[EnumC0438D.m1881d().size()]).mo713p(serializer, obj);
    }
}
