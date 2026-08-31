package p179X4;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;
import p063H5.AbstractC0533b;
import p063H5.C0530Z;
import p063H5.C0554l0;
import p123P4.AbstractC1221a;
import p164V3.C1759d;
import p186Y4.AbstractC2044l;
import p186Y4.AbstractC2049q;
import p261h5.C5654a;

/* JADX INFO: renamed from: X4.s */
/* JADX INFO: loaded from: classes.dex */
final class C1996s extends AbstractC0533b {

    /* JADX INFO: renamed from: c */
    private static final C0530Z.g f6636c;

    /* JADX INFO: renamed from: d */
    private static final C0530Z.g f6637d;

    /* JADX INFO: renamed from: a */
    private final AbstractC1221a f6638a;

    /* JADX INFO: renamed from: b */
    private final AbstractC1221a f6639b;

    static {
        C0530Z.d dVar = C0530Z.f1980e;
        f6636c = C0530Z.g.m2296e("Authorization", dVar);
        f6637d = C0530Z.g.m2296e("x-firebase-appcheck", dVar);
    }

    C1996s(AbstractC1221a abstractC1221a, AbstractC1221a abstractC1221a2) {
        this.f6638a = abstractC1221a;
        this.f6639b = abstractC1221a2;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m8356b(Task task, AbstractC0533b.a aVar, Task task2, Task task3) {
        C0530Z c0530z = new C0530Z();
        if (task.isSuccessful()) {
            String str = (String) task.getResult();
            AbstractC2049q.m8502a("FirestoreCallCredentials", "Successfully fetched auth token.", new Object[0]);
            if (str != null) {
                c0530z.m2287p(f6636c, "Bearer " + str);
            }
        } else {
            Exception exception = task.getException();
            if (exception instanceof C1759d) {
                AbstractC2049q.m8502a("FirestoreCallCredentials", "Firebase Auth API not available, not using authentication.", new Object[0]);
            } else {
                if (!(exception instanceof C5654a)) {
                    AbstractC2049q.m8505d("FirestoreCallCredentials", "Failed to get auth token: %s.", exception);
                    aVar.mo2341b(C0554l0.f2106m.m2461p(exception));
                    return;
                }
                AbstractC2049q.m8502a("FirestoreCallCredentials", "No user signed in, not using authentication.", new Object[0]);
            }
        }
        if (task2.isSuccessful()) {
            String str2 = (String) task2.getResult();
            if (str2 != null && !str2.isEmpty()) {
                AbstractC2049q.m8502a("FirestoreCallCredentials", "Successfully fetched AppCheck token.", new Object[0]);
                c0530z.m2287p(f6637d, str2);
            }
        } else {
            Exception exception2 = task2.getException();
            if (!(exception2 instanceof C1759d)) {
                AbstractC2049q.m8505d("FirestoreCallCredentials", "Failed to get AppCheck token: %s.", exception2);
                aVar.mo2341b(C0554l0.f2106m.m2461p(exception2));
                return;
            }
            AbstractC2049q.m8502a("FirestoreCallCredentials", "Firebase AppCheck API not available.", new Object[0]);
        }
        aVar.mo2340a(c0530z);
    }

    @Override // p063H5.AbstractC0533b
    /* JADX INFO: renamed from: a */
    public void mo2339a(AbstractC0533b.b bVar, Executor executor, final AbstractC0533b.a aVar) {
        final Task taskMo5338a = this.f6638a.mo5338a();
        final Task taskMo5338a2 = this.f6639b.mo5338a();
        Tasks.whenAll((Task<?>[]) new Task[]{taskMo5338a, taskMo5338a2}).addOnCompleteListener(AbstractC2044l.f6763b, new OnCompleteListener() { // from class: X4.r
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C1996s.m8356b(taskMo5338a, aVar, taskMo5338a2, task);
            }
        });
    }
}
