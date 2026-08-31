package p400y6;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.AbstractC6093h;
import p145S5.AbstractC1437o;
import p145S5.C1436n;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5367l;
import p318o6.C6682p;
import p318o6.InterfaceC6678n;

/* JADX INFO: renamed from: y6.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7555b {

    /* JADX INFO: renamed from: y6.b$a */
    static final class a implements OnCompleteListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC6678n f30210a;

        a(InterfaceC6678n interfaceC6678n) {
            this.f30210a = interfaceC6678n;
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public final void onComplete(Task task) {
            Exception exception = task.getException();
            if (exception != null) {
                InterfaceC6678n interfaceC6678n = this.f30210a;
                C1436n.a aVar = C1436n.f4958b;
                interfaceC6678n.resumeWith(C1436n.m6073b(AbstractC1437o.m6081a(exception)));
            } else {
                if (task.isCanceled()) {
                    InterfaceC6678n.a.m28240a(this.f30210a, null, 1, null);
                    return;
                }
                InterfaceC6678n interfaceC6678n2 = this.f30210a;
                C1436n.a aVar2 = C1436n.f4958b;
                interfaceC6678n2.resumeWith(C1436n.m6073b(task.getResult()));
            }
        }
    }

    /* JADX INFO: renamed from: y6.b$b */
    static final class b implements InterfaceC5367l {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ CancellationTokenSource f30211a;

        b(CancellationTokenSource cancellationTokenSource) {
            this.f30211a = cancellationTokenSource;
        }

        /* JADX INFO: renamed from: a */
        public final void m33255a(Throwable th) {
            this.f30211a.cancel();
        }

        @Override // p238e6.InterfaceC5367l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m33255a((Throwable) obj);
            return C1444v.f4971a;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Object m33253a(Task task, InterfaceC1875e interfaceC1875e) {
        return m33254b(task, null, interfaceC1875e);
    }

    /* JADX INFO: renamed from: b */
    private static final Object m33254b(Task task, CancellationTokenSource cancellationTokenSource, InterfaceC1875e interfaceC1875e) throws Exception {
        if (!task.isComplete()) {
            C6682p c6682p = new C6682p(AbstractC2005b.m8367c(interfaceC1875e), 1);
            c6682p.m28263E();
            task.addOnCompleteListener(ExecutorC7554a.f30209a, new a(c6682p));
            if (cancellationTokenSource != null) {
                c6682p.mo28234a(new b(cancellationTokenSource));
            }
            Object objM28273y = c6682p.m28273y();
            if (objM28273y == AbstractC2005b.m8369e()) {
                AbstractC6093h.m27135c(interfaceC1875e);
            }
            return objM28273y;
        }
        Exception exception = task.getException();
        if (exception != null) {
            throw exception;
        }
        if (!task.isCanceled()) {
            return task.getResult();
        }
        throw new CancellationException("Task " + task + " was cancelled normally.");
    }
}
