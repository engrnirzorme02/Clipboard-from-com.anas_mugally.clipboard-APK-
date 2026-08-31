package p367u5;

import androidx.appcompat.app.AbstractC2263x;
import com.google.gson.EnumC5054o;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: u5.E */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7166E {

    /* JADX INFO: renamed from: u5.E$b */
    private static abstract class b {

        /* JADX INFO: renamed from: a */
        static final b f28632a;

        /* JADX INFO: renamed from: u5.E$b$a */
        class a extends b {

            /* JADX INFO: renamed from: b */
            final /* synthetic */ Method f28633b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Method method) {
                super();
                this.f28633b = method;
            }

            @Override // p367u5.AbstractC7166E.b
            /* JADX INFO: renamed from: a */
            public boolean mo31674a(AccessibleObject accessibleObject, Object obj) {
                try {
                    return ((Boolean) this.f28633b.invoke(accessibleObject, obj)).booleanValue();
                } catch (Exception e7) {
                    throw new RuntimeException("Failed invoking canAccess", e7);
                }
            }
        }

        /* JADX INFO: renamed from: u5.E$b$b, reason: collision with other inner class name */
        class C7727b extends b {
            C7727b() {
                super();
            }

            @Override // p367u5.AbstractC7166E.b
            /* JADX INFO: renamed from: a */
            public boolean mo31674a(AccessibleObject accessibleObject, Object obj) {
                return true;
            }
        }

        static {
            b aVar;
            if (AbstractC7192w.m31743c()) {
                try {
                    aVar = new a(AccessibleObject.class.getDeclaredMethod("canAccess", Object.class));
                } catch (NoSuchMethodException unused) {
                    aVar = null;
                }
            } else {
                aVar = null;
            }
            if (aVar == null) {
                aVar = new C7727b();
            }
            f28632a = aVar;
        }

        private b() {
        }

        /* JADX INFO: renamed from: a */
        abstract boolean mo31674a(AccessibleObject accessibleObject, Object obj);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m31672a(AccessibleObject accessibleObject, Object obj) {
        return b.f28632a.mo31674a(accessibleObject, obj);
    }

    /* JADX INFO: renamed from: b */
    public static EnumC5054o m31673b(List list, Class cls) {
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return EnumC5054o.ALLOW;
        }
        AbstractC2263x.m9328a(it.next());
        throw null;
    }
}
