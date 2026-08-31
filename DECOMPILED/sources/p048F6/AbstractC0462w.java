package p048F6;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.AbstractC6118n;
import p016B6.InterfaceC0096d;
import p040E6.AbstractC0393b;
import p040E6.EnumC0392a;
import p040E6.InterfaceC0394c;

/* JADX INFO: renamed from: F6.w */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0462w {

    /* JADX INFO: renamed from: F6.w$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f1736a;

        static {
            int[] iArr = new int[EnumC0392a.values().length];
            try {
                iArr[EnumC0392a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC0392a.POLYMORPHIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC0392a.ALL_JSON_OBJECTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f1736a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final String m1993a(InterfaceC0096d interfaceC0096d, AbstractC0393b json) {
        AbstractC6118n.m27187e(interfaceC0096d, "<this>");
        AbstractC6118n.m27187e(json, "json");
        for (Annotation annotation : interfaceC0096d.getAnnotations()) {
            if (annotation instanceof InterfaceC0394c) {
                return ((InterfaceC0394c) annotation).discriminator();
            }
        }
        return json.m1673c().m1680e();
    }
}
