package p274j2;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;
import p216c2.AbstractC3000p;
import p250g2.AbstractC5459a;
import p282k2.InterfaceC5995d;
import p306n2.AbstractC6482a;

/* JADX INFO: renamed from: j2.d */
/* JADX INFO: loaded from: classes.dex */
public class C5841d implements InterfaceC5861x {

    /* JADX INFO: renamed from: a */
    private final Context f22972a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC5995d f22973b;

    /* JADX INFO: renamed from: c */
    private final AbstractC5843f f22974c;

    public C5841d(Context context, InterfaceC5995d interfaceC5995d, AbstractC5843f abstractC5843f) {
        this.f22972a = context;
        this.f22973b = interfaceC5995d;
        this.f22974c = abstractC5843f;
    }

    /* JADX INFO: renamed from: d */
    private boolean m26238d(JobScheduler jobScheduler, int i7, int i8) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i9 = jobInfo.getExtras().getInt("attemptNumber");
            if (jobInfo.getId() == i7) {
                if (i9 >= i8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p274j2.InterfaceC5861x
    /* JADX INFO: renamed from: a */
    public void mo26239a(AbstractC3000p abstractC3000p, int i7) {
        mo26240b(abstractC3000p, i7, false);
    }

    @Override // p274j2.InterfaceC5861x
    /* JADX INFO: renamed from: b */
    public void mo26240b(AbstractC3000p abstractC3000p, int i7, boolean z7) {
        ComponentName componentName = new ComponentName(this.f22972a, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f22972a.getSystemService("jobscheduler");
        int iM26241c = m26241c(abstractC3000p);
        if (!z7 && m26238d(jobScheduler, iM26241c, i7)) {
            AbstractC5459a.m24663a("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", abstractC3000p);
            return;
        }
        long jMo26976D0 = this.f22973b.mo26976D0(abstractC3000p);
        JobInfo.Builder builderM26248c = this.f22974c.m26248c(new JobInfo.Builder(iM26241c, componentName), abstractC3000p.mo14931d(), jMo26976D0, i7);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i7);
        persistableBundle.putString("backendName", abstractC3000p.mo14929b());
        persistableBundle.putInt("priority", AbstractC6482a.m27649a(abstractC3000p.mo14931d()));
        if (abstractC3000p.mo14930c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(abstractC3000p.mo14930c(), 0));
        }
        builderM26248c.setExtras(persistableBundle);
        AbstractC5459a.m24664b("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", abstractC3000p, Integer.valueOf(iM26241c), Long.valueOf(this.f22974c.m26249g(abstractC3000p.mo14931d(), jMo26976D0, i7)), Long.valueOf(jMo26976D0), Integer.valueOf(i7));
        jobScheduler.schedule(builderM26248c.build());
    }

    /* JADX INFO: renamed from: c */
    int m26241c(AbstractC3000p abstractC3000p) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f22972a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(abstractC3000p.mo14929b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(AbstractC6482a.m27649a(abstractC3000p.mo14931d())).array());
        if (abstractC3000p.mo14930c() != null) {
            adler32.update(abstractC3000p.mo14930c());
        }
        return (int) adler32.getValue();
    }
}
