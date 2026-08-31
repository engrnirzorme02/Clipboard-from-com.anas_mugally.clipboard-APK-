package p089L;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import androidx.collection.C2399j;
import androidx.collection.C2400k;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p033E.AbstractC0264s;
import p066I0.AbstractC0578a;
import p104N.InterfaceC0904a;

/* JADX INFO: renamed from: L.j */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0774j {

    /* JADX INFO: renamed from: a */
    static final C2399j f3128a = new C2399j(16);

    /* JADX INFO: renamed from: b */
    private static final ExecutorService f3129b = AbstractC0777m.m3654a("fonts-androidx", 10, 10000);

    /* JADX INFO: renamed from: c */
    static final Object f3130c = new Object();

    /* JADX INFO: renamed from: d */
    static final C2400k f3131d = new C2400k();

    /* JADX INFO: renamed from: L.j$a */
    class a implements Callable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f3132a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Context f3133b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C0769e f3134c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ int f3135d;

        a(String str, Context context, C0769e c0769e, int i7) {
            this.f3132a = str;
            this.f3133b = context;
            this.f3134c = c0769e;
            this.f3135d = i7;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            return AbstractC0774j.m3627c(this.f3132a, this.f3133b, AbstractC0772h.m3623a(new Object[]{this.f3134c}), this.f3135d);
        }
    }

    /* JADX INFO: renamed from: L.j$b */
    class b implements InterfaceC0904a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C0765a f3136a;

        b(C0765a c0765a) {
            this.f3136a = c0765a;
        }

        @Override // p104N.InterfaceC0904a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.f3136a.m3601b(eVar);
        }
    }

    /* JADX INFO: renamed from: L.j$c */
    class c implements Callable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f3137a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Context f3138b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ List f3139c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ int f3140d;

        c(String str, Context context, List list, int i7) {
            this.f3137a = str;
            this.f3138b = context;
            this.f3139c = list;
            this.f3140d = i7;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            try {
                return AbstractC0774j.m3627c(this.f3137a, this.f3138b, this.f3139c, this.f3140d);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    /* JADX INFO: renamed from: L.j$d */
    class d implements InterfaceC0904a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f3141a;

        d(String str) {
            this.f3141a = str;
        }

        @Override // p104N.InterfaceC0904a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            synchronized (AbstractC0774j.f3130c) {
                try {
                    C2400k c2400k = AbstractC0774j.f3131d;
                    ArrayList arrayList = (ArrayList) c2400k.get(this.f3141a);
                    if (arrayList == null) {
                        return;
                    }
                    c2400k.remove(this.f3141a);
                    for (int i7 = 0; i7 < arrayList.size(); i7++) {
                        ((InterfaceC0904a) arrayList.get(i7)).accept(eVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static String m3625a(List list, int i7) {
        StringBuilder sb = new StringBuilder();
        for (int i8 = 0; i8 < list.size(); i8++) {
            sb.append(((C0769e) list.get(i8)).m3615d());
            sb.append("-");
            sb.append(i7);
            if (i8 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    private static int m3626b(AbstractC0776l.a aVar) {
        int i7 = 1;
        if (aVar.m3643e() != 0) {
            return aVar.m3643e() != 1 ? -3 : -2;
        }
        AbstractC0776l.b[] bVarArrM3641c = aVar.m3641c();
        if (bVarArrM3641c != null && bVarArrM3641c.length != 0) {
            i7 = 0;
            for (AbstractC0776l.b bVar : bVarArrM3641c) {
                int iM3646b = bVar.m3646b();
                if (iM3646b != 0) {
                    if (iM3646b < 0) {
                        return -3;
                    }
                    return iM3646b;
                }
            }
        }
        return i7;
    }

    /* JADX INFO: renamed from: c */
    static e m3627c(String str, Context context, List list, int i7) {
        AbstractC0578a.m2543a("getFontSync");
        try {
            C2399j c2399j = f3128a;
            Typeface typeface = (Typeface) c2399j.get(str);
            if (typeface != null) {
                e eVar = new e(typeface);
                AbstractC0578a.m2544b();
                return eVar;
            }
            try {
                AbstractC0776l.a aVarM3607e = AbstractC0768d.m3607e(context, list, null);
                int iM3626b = m3626b(aVarM3607e);
                if (iM3626b != 0) {
                    e eVar2 = new e(iM3626b);
                    AbstractC0578a.m2544b();
                    return eVar2;
                }
                Typeface typefaceM1225b = (!aVarM3607e.m3644f() || Build.VERSION.SDK_INT < 29) ? AbstractC0264s.m1225b(context, null, aVarM3607e.m3641c(), i7) : AbstractC0264s.m1226c(context, null, aVarM3607e.m3642d(), i7);
                if (typefaceM1225b == null) {
                    e eVar3 = new e(-3);
                    AbstractC0578a.m2544b();
                    return eVar3;
                }
                c2399j.put(str, typefaceM1225b);
                e eVar4 = new e(typefaceM1225b);
                AbstractC0578a.m2544b();
                return eVar4;
            } catch (PackageManager.NameNotFoundException unused) {
                e eVar5 = new e(-1);
                AbstractC0578a.m2544b();
                return eVar5;
            }
        } catch (Throwable th) {
            AbstractC0578a.m2544b();
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    static Typeface m3628d(Context context, List list, int i7, Executor executor, C0765a c0765a) {
        String strM3625a = m3625a(list, i7);
        Typeface typeface = (Typeface) f3128a.get(strM3625a);
        if (typeface != null) {
            c0765a.m3601b(new e(typeface));
            return typeface;
        }
        b bVar = new b(c0765a);
        synchronized (f3130c) {
            try {
                C2400k c2400k = f3131d;
                ArrayList arrayList = (ArrayList) c2400k.get(strM3625a);
                if (arrayList != null) {
                    arrayList.add(bVar);
                    return null;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(bVar);
                c2400k.put(strM3625a, arrayList2);
                c cVar = new c(strM3625a, context, list, i7);
                if (executor == null) {
                    executor = f3129b;
                }
                AbstractC0777m.m3656c(executor, cVar, new d(strM3625a));
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    static Typeface m3629e(Context context, C0769e c0769e, C0765a c0765a, int i7, int i8) {
        String strM3625a = m3625a(AbstractC0772h.m3623a(new Object[]{c0769e}), i7);
        Typeface typeface = (Typeface) f3128a.get(strM3625a);
        if (typeface != null) {
            c0765a.m3601b(new e(typeface));
            return typeface;
        }
        if (i8 == -1) {
            e eVarM3627c = m3627c(strM3625a, context, AbstractC0772h.m3623a(new Object[]{c0769e}), i7);
            c0765a.m3601b(eVarM3627c);
            return eVarM3627c.f3142a;
        }
        try {
            e eVar = (e) AbstractC0777m.m3657d(f3129b, new a(strM3625a, context, c0769e, i7), i8);
            c0765a.m3601b(eVar);
            return eVar.f3142a;
        } catch (InterruptedException unused) {
            c0765a.m3601b(new e(-3));
            return null;
        }
    }

    /* JADX INFO: renamed from: L.j$e */
    static final class e {

        /* JADX INFO: renamed from: a */
        final Typeface f3142a;

        /* JADX INFO: renamed from: b */
        final int f3143b;

        e(int i7) {
            this.f3142a = null;
            this.f3143b = i7;
        }

        /* JADX INFO: renamed from: a */
        boolean m3634a() {
            return this.f3143b == 0;
        }

        e(Typeface typeface) {
            this.f3142a = typeface;
            this.f3143b = 0;
        }
    }
}
