package p394y0;

import android.content.Context;
import kotlin.jvm.internal.AbstractC6118n;
import p302m6.AbstractC6406h;

/* JADX INFO: renamed from: y0.p */
/* JADX INFO: loaded from: classes.dex */
public final class C7461p {

    /* JADX INFO: renamed from: a */
    public static final C7461p f29918a = new C7461p();

    private C7461p() {
    }

    /* JADX INFO: renamed from: a */
    public static final AbstractC7462q.a m33018a(Context context, Class klass, String str) {
        AbstractC6118n.m27187e(context, "context");
        AbstractC6118n.m27187e(klass, "klass");
        if (str == null || AbstractC6406h.m27604c0(str)) {
            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        return new AbstractC7462q.a(context, klass, str);
    }

    /* JADX INFO: renamed from: b */
    public static final Object m33019b(Class klass, String suffix) {
        String str;
        AbstractC6118n.m27187e(klass, "klass");
        AbstractC6118n.m27187e(suffix, "suffix");
        Package r7 = klass.getPackage();
        AbstractC6118n.m27184b(r7);
        String fullPackage = r7.getName();
        String canonicalName = klass.getCanonicalName();
        AbstractC6118n.m27184b(canonicalName);
        AbstractC6118n.m27186d(fullPackage, "fullPackage");
        if (fullPackage.length() != 0) {
            canonicalName = canonicalName.substring(fullPackage.length() + 1);
            AbstractC6118n.m27186d(canonicalName, "this as java.lang.String).substring(startIndex)");
        }
        String str2 = AbstractC6406h.m27550D(canonicalName, '.', '_', false, 4, null) + suffix;
        try {
            if (fullPackage.length() == 0) {
                str = str2;
            } else {
                str = fullPackage + '.' + str2;
            }
            Class<?> cls = Class.forName(str, true, klass.getClassLoader());
            AbstractC6118n.m27185c(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
            return cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Cannot find implementation for " + klass.getCanonicalName() + ". " + str2 + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor " + klass.getCanonicalName());
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + klass.getCanonicalName());
        }
    }

    /* JADX INFO: renamed from: c */
    public static final AbstractC7462q.a m33020c(Context context, Class klass) {
        AbstractC6118n.m27187e(context, "context");
        AbstractC6118n.m27187e(klass, "klass");
        return new AbstractC7462q.a(context, klass, null);
    }
}
