package p063H5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

/* JADX INFO: renamed from: H5.k0 */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0552k0 {

    /* JADX INFO: renamed from: H5.k0$a */
    class a implements Comparator {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ b f2095a;

        a(b bVar) {
            this.f2095a = bVar;
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            int iMo2242b = this.f2095a.mo2242b(obj) - this.f2095a.mo2242b(obj2);
            return iMo2242b != 0 ? iMo2242b : obj.getClass().getName().compareTo(obj2.getClass().getName());
        }
    }

    /* JADX INFO: renamed from: H5.k0$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        boolean mo2241a(Object obj);

        /* JADX INFO: renamed from: b */
        int mo2242b(Object obj);
    }

    /* JADX INFO: renamed from: a */
    private static Object m2438a(Class cls, Class cls2) {
        try {
            return cls2.asSubclass(cls).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassCastException unused) {
            return null;
        } catch (Throwable th) {
            throw new ServiceConfigurationError(String.format("Provider %s could not be instantiated %s", cls2.getName(), th), th);
        }
    }

    /* JADX INFO: renamed from: b */
    static Iterable m2439b(Class cls, Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Object objM2438a = m2438a(cls, (Class) it.next());
            if (objM2438a != null) {
                arrayList.add(objM2438a);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public static Iterable m2440c(Class cls, ClassLoader classLoader) {
        ServiceLoader serviceLoaderLoad = ServiceLoader.load(cls, classLoader);
        return !serviceLoaderLoad.iterator().hasNext() ? ServiceLoader.load(cls) : serviceLoaderLoad;
    }

    /* JADX INFO: renamed from: d */
    static boolean m2441d(ClassLoader classLoader) {
        try {
            Class.forName("android.app.Application", false, classLoader);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    public static List m2442e(Class cls, Iterable iterable, ClassLoader classLoader, b bVar) {
        Iterable iterableM2439b = m2441d(classLoader) ? m2439b(cls, iterable) : m2440c(cls, classLoader);
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterableM2439b) {
            if (bVar.mo2241a(obj)) {
                arrayList.add(obj);
            }
        }
        Collections.sort(arrayList, Collections.reverseOrder(new a(bVar)));
        return Collections.unmodifiableList(arrayList);
    }
}
