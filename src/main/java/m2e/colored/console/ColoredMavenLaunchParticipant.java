package m2e.colored.console;

import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.sourcelookup.ISourceLookupParticipant;
import org.eclipse.m2e.internal.launch.IMavenLaunchParticipant;

public class ColoredMavenLaunchParticipant implements IMavenLaunchParticipant {

	@Override
	public String getProgramArguments(ILaunchConfiguration configuration, ILaunch launch, IProgressMonitor monitor) {
		return "-Dstyle.color=always";
	}

	@Override
	public String getVMArguments(ILaunchConfiguration configuration, ILaunch launch, IProgressMonitor monitor) {
		return "-Djansi.force=true";
	}

	@Override
	public List<ISourceLookupParticipant> getSourceLookupParticipants(ILaunchConfiguration configuration,
			ILaunch launch, IProgressMonitor monitor) {
		return Collections.emptyList();
	}

}
