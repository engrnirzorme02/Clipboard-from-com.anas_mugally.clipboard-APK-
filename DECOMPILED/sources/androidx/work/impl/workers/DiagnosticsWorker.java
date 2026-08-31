package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p112O0.AbstractC1097j;
import p119P0.C1182i;
import p168W0.C1805g;
import p168W0.C1814p;
import p168W0.InterfaceC1806h;
import p168W0.InterfaceC1809k;
import p168W0.InterfaceC1815q;
import p168W0.InterfaceC1818t;

/* JADX INFO: loaded from: classes.dex */
public class DiagnosticsWorker extends Worker {

    /* JADX INFO: renamed from: r */
    private static final String f12029r = AbstractC1097j.m4846f("DiagnosticsWrkr");

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* JADX INFO: renamed from: a */
    private static String m14634a(C1814p c1814p, String str, Integer num, String str2) {
        return String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", c1814p.f5892a, c1814p.f5894c, num, c1814p.f5893b.name(), str, str2);
    }

    /* JADX INFO: renamed from: c */
    private static String m14635c(InterfaceC1809k interfaceC1809k, InterfaceC1818t interfaceC1818t, InterfaceC1806h interfaceC1806h, List list) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", "Job Id"));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1814p c1814p = (C1814p) it.next();
            C1805g c1805gMo7521b = interfaceC1806h.mo7521b(c1814p.f5892a);
            sb.append(m14634a(c1814p, TextUtils.join(",", interfaceC1809k.mo7526b(c1814p.f5892a)), c1805gMo7521b != null ? Integer.valueOf(c1805gMo7521b.f5870b) : null, TextUtils.join(",", interfaceC1818t.mo7560b(c1814p.f5892a))));
        }
        return sb.toString();
    }

    @Override // androidx.work.Worker
    public ListenableWorker.AbstractC2892a doWork() {
        WorkDatabase workDatabaseM5173o = C1182i.m5164k(getApplicationContext()).m5173o();
        InterfaceC1815q interfaceC1815qMo14518K = workDatabaseM5173o.mo14518K();
        InterfaceC1809k interfaceC1809kMo14516I = workDatabaseM5173o.mo14516I();
        InterfaceC1818t interfaceC1818tMo14519L = workDatabaseM5173o.mo14519L();
        InterfaceC1806h interfaceC1806hMo14515H = workDatabaseM5173o.mo14515H();
        List listMo7540d = interfaceC1815qMo14518K.mo7540d(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        List listMo7545i = interfaceC1815qMo14518K.mo7545i();
        List listMo7556t = interfaceC1815qMo14518K.mo7556t(200);
        if (listMo7540d != null && !listMo7540d.isEmpty()) {
            AbstractC1097j abstractC1097jM4844c = AbstractC1097j.m4844c();
            String str = f12029r;
            abstractC1097jM4844c.mo4849d(str, "Recently completed work:\n\n", new Throwable[0]);
            AbstractC1097j.m4844c().mo4849d(str, m14635c(interfaceC1809kMo14516I, interfaceC1818tMo14519L, interfaceC1806hMo14515H, listMo7540d), new Throwable[0]);
        }
        if (listMo7545i != null && !listMo7545i.isEmpty()) {
            AbstractC1097j abstractC1097jM4844c2 = AbstractC1097j.m4844c();
            String str2 = f12029r;
            abstractC1097jM4844c2.mo4849d(str2, "Running work:\n\n", new Throwable[0]);
            AbstractC1097j.m4844c().mo4849d(str2, m14635c(interfaceC1809kMo14516I, interfaceC1818tMo14519L, interfaceC1806hMo14515H, listMo7545i), new Throwable[0]);
        }
        if (listMo7556t != null && !listMo7556t.isEmpty()) {
            AbstractC1097j abstractC1097jM4844c3 = AbstractC1097j.m4844c();
            String str3 = f12029r;
            abstractC1097jM4844c3.mo4849d(str3, "Enqueued work:\n\n", new Throwable[0]);
            AbstractC1097j.m4844c().mo4849d(str3, m14635c(interfaceC1809kMo14516I, interfaceC1818tMo14519L, interfaceC1806hMo14515H, listMo7556t), new Throwable[0]);
        }
        return ListenableWorker.AbstractC2892a.m14463c();
    }
}
