package p230d6;

import kotlin.jvm.internal.AbstractC6100C;
import kotlin.jvm.internal.AbstractC6118n;
import kotlin.jvm.internal.InterfaceC6109e;
import p286k6.InterfaceC6077c;

/* JADX INFO: renamed from: d6.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5245a {
    /* JADX INFO: renamed from: a */
    public static final Class m24241a(InterfaceC6077c interfaceC6077c) {
        AbstractC6118n.m27187e(interfaceC6077c, "<this>");
        Class clsMo27173d = ((InterfaceC6109e) interfaceC6077c).mo27173d();
        AbstractC6118n.m27185c(clsMo27173d, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return clsMo27173d;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: b */
    public static final Class m24242b(InterfaceC6077c interfaceC6077c) {
        AbstractC6118n.m27187e(interfaceC6077c, "<this>");
        Class clsMo27173d = ((InterfaceC6109e) interfaceC6077c).mo27173d();
        if (!clsMo27173d.isPrimitive()) {
            AbstractC6118n.m27185c(clsMo27173d, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return clsMo27173d;
        }
        String name = clsMo27173d.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    clsMo27173d = Double.class;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    clsMo27173d = Integer.class;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    clsMo27173d = Byte.class;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    clsMo27173d = Character.class;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    clsMo27173d = Long.class;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    clsMo27173d = Void.class;
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    clsMo27173d = Boolean.class;
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    clsMo27173d = Float.class;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    clsMo27173d = Short.class;
                }
                break;
        }
        AbstractC6118n.m27185c(clsMo27173d, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return clsMo27173d;
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC6077c m24243c(Class cls) {
        AbstractC6118n.m27187e(cls, "<this>");
        return AbstractC6100C.m27139b(cls);
    }
}
