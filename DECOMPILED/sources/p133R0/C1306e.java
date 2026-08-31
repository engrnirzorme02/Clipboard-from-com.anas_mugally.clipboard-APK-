package p133R0;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p112O0.AbstractC1097j;
import p112O0.EnumC1101n;
import p112O0.EnumC1106s;
import p119P0.C1182i;
import p119P0.InterfaceC1178e;
import p168W0.C1805g;
import p168W0.C1814p;
import p168W0.InterfaceC1815q;
import p175X0.C1928f;

/* JADX INFO: renamed from: R0.e */
/* JADX INFO: loaded from: classes.dex */
public class C1306e implements InterfaceC1178e {

    /* JADX INFO: renamed from: e */
    private static final String f4593e = AbstractC1097j.m4846f("SystemJobScheduler");

    /* JADX INFO: renamed from: a */
    private final Context f4594a;

    /* JADX INFO: renamed from: b */
    private final JobScheduler f4595b;

    /* JADX INFO: renamed from: c */
    private final C1182i f4596c;

    /* JADX INFO: renamed from: d */
    private final C1305d f4597d;

    public C1306e(Context context, C1182i c1182i) {
        this(context, c1182i, (JobScheduler) context.getSystemService("jobscheduler"), new C1305d(context));
    }

    /* JADX INFO: renamed from: b */
    public static void m5640b(Context context) {
        List listM5643g;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler == null || (listM5643g = m5643g(context, jobScheduler)) == null || listM5643g.isEmpty()) {
            return;
        }
        Iterator it = listM5643g.iterator();
        while (it.hasNext()) {
            m5641d(jobScheduler, ((JobInfo) it.next()).getId());
        }
    }

    /* JADX INFO: renamed from: d */
    private static void m5641d(JobScheduler jobScheduler, int i7) {
        try {
            jobScheduler.cancel(i7);
        } catch (Throwable th) {
            AbstractC1097j.m4844c().mo4848b(f4593e, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i7)), th);
        }
    }

    /* JADX INFO: renamed from: f */
    private static List m5642f(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> listM5643g = m5643g(context, jobScheduler);
        if (listM5643g == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : listM5643g) {
            if (str.equals(m5644h(jobInfo))) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    private static List m5643g(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            AbstractC1097j.m4844c().mo4848b(f4593e, "getAllPendingJobs() is not reliable on this device.", th);
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    private static String m5644h(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return extras.getString("EXTRA_WORK_SPEC_ID");
            }
            return null;
        } catch (NullPointerException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public static boolean m5645i(Context context, C1182i c1182i) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> listM5643g = m5643g(context, jobScheduler);
        List listMo7520a = c1182i.m5173o().mo14515H().mo7520a();
        boolean z7 = false;
        HashSet hashSet = new HashSet(listM5643g != null ? listM5643g.size() : 0);
        if (listM5643g != null && !listM5643g.isEmpty()) {
            for (JobInfo jobInfo : listM5643g) {
                String strM5644h = m5644h(jobInfo);
                if (TextUtils.isEmpty(strM5644h)) {
                    m5641d(jobScheduler, jobInfo.getId());
                } else {
                    hashSet.add(strM5644h);
                }
            }
        }
        Iterator it = listMo7520a.iterator();
        while (it.hasNext()) {
            if (!hashSet.contains((String) it.next())) {
                AbstractC1097j.m4844c().mo4847a(f4593e, "Reconciling jobs", new Throwable[0]);
                z7 = true;
                break;
            }
        }
        if (!z7) {
            return z7;
        }
        WorkDatabase workDatabaseM5173o = c1182i.m5173o();
        workDatabaseM5173o.m33029e();
        try {
            InterfaceC1815q interfaceC1815qMo14518K = workDatabaseM5173o.mo14518K();
            Iterator it2 = listMo7520a.iterator();
            while (it2.hasNext()) {
                interfaceC1815qMo14518K.mo7538b((String) it2.next(), -1L);
            }
            workDatabaseM5173o.m33042z();
            return z7;
        } finally {
            workDatabaseM5173o.m33031i();
        }
    }

    @Override // p119P0.InterfaceC1178e
    /* JADX INFO: renamed from: a */
    public void mo5139a(C1814p... c1814pArr) {
        WorkDatabase workDatabaseM5173o = this.f4596c.m5173o();
        C1928f c1928f = new C1928f(workDatabaseM5173o);
        for (C1814p c1814p : c1814pArr) {
            workDatabaseM5173o.m33029e();
            try {
                C1814p c1814pMo7550n = workDatabaseM5173o.mo14518K().mo7550n(c1814p.f5892a);
                if (c1814pMo7550n == null) {
                    AbstractC1097j.m4844c().mo4851h(f4593e, "Skipping scheduling " + c1814p.f5892a + " because it's no longer in the DB", new Throwable[0]);
                    workDatabaseM5173o.m33042z();
                } else if (c1814pMo7550n.f5893b != EnumC1106s.ENQUEUED) {
                    AbstractC1097j.m4844c().mo4851h(f4593e, "Skipping scheduling " + c1814p.f5892a + " because it is no longer enqueued", new Throwable[0]);
                    workDatabaseM5173o.m33042z();
                } else {
                    C1805g c1805gMo7521b = workDatabaseM5173o.mo14515H().mo7521b(c1814p.f5892a);
                    int iM7976d = c1805gMo7521b != null ? c1805gMo7521b.f5870b : c1928f.m7976d(this.f4596c.m5169i().m14488i(), this.f4596c.m5169i().m14486g());
                    if (c1805gMo7521b == null) {
                        this.f4596c.m5173o().mo14515H().mo7522c(new C1805g(c1814p.f5892a, iM7976d));
                    }
                    m5646j(c1814p, iM7976d);
                    workDatabaseM5173o.m33042z();
                }
                workDatabaseM5173o.m33031i();
            } catch (Throwable th) {
                workDatabaseM5173o.m33031i();
                throw th;
            }
        }
    }

    @Override // p119P0.InterfaceC1178e
    /* JADX INFO: renamed from: c */
    public boolean mo5140c() {
        return true;
    }

    @Override // p119P0.InterfaceC1178e
    /* JADX INFO: renamed from: e */
    public void mo5141e(String str) {
        List listM5642f = m5642f(this.f4594a, this.f4595b, str);
        if (listM5642f == null || listM5642f.isEmpty()) {
            return;
        }
        Iterator it = listM5642f.iterator();
        while (it.hasNext()) {
            m5641d(this.f4595b, ((Integer) it.next()).intValue());
        }
        this.f4596c.m5173o().mo14515H().mo7523d(str);
    }

    /* JADX INFO: renamed from: j */
    public void m5646j(C1814p c1814p, int i7) {
        JobInfo jobInfoM5639a = this.f4597d.m5639a(c1814p, i7);
        AbstractC1097j abstractC1097jM4844c = AbstractC1097j.m4844c();
        String str = f4593e;
        abstractC1097jM4844c.mo4847a(str, String.format("Scheduling work ID %s Job ID %s", c1814p.f5892a, Integer.valueOf(i7)), new Throwable[0]);
        try {
            if (this.f4595b.schedule(jobInfoM5639a) == 0) {
                AbstractC1097j.m4844c().mo4851h(str, String.format("Unable to schedule work ID %s", c1814p.f5892a), new Throwable[0]);
                if (c1814p.f5908q && c1814p.f5909r == EnumC1101n.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    c1814p.f5908q = false;
                    AbstractC1097j.m4844c().mo4847a(str, String.format("Scheduling a non-expedited job (work ID %s)", c1814p.f5892a), new Throwable[0]);
                    m5646j(c1814p, i7);
                }
            }
        } catch (IllegalStateException e7) {
            List listM5643g = m5643g(this.f4594a, this.f4595b);
            String str2 = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(listM5643g != null ? listM5643g.size() : 0), Integer.valueOf(this.f4596c.m5173o().mo14518K().mo7542f().size()), Integer.valueOf(this.f4596c.m5169i().m14487h()));
            AbstractC1097j.m4844c().mo4848b(f4593e, str2, new Throwable[0]);
            throw new IllegalStateException(str2, e7);
        } catch (Throwable th) {
            AbstractC1097j.m4844c().mo4848b(f4593e, String.format("Unable to schedule %s", c1814p), th);
        }
    }

    public C1306e(Context context, C1182i c1182i, JobScheduler jobScheduler, C1305d c1305d) {
        this.f4594a = context;
        this.f4596c = c1182i;
        this.f4595b = jobScheduler;
        this.f4597d = c1305d;
    }
}
