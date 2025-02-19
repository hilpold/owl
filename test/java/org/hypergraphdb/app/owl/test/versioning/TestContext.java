package org.hypergraphdb.app.owl.test.versioning;

import org.hypergraphdb.HyperGraph;
import org.hypergraphdb.app.owl.HGDBOntology;
import org.hypergraphdb.app.owl.HGDBOntologyManager;
import org.hypergraphdb.app.owl.HGDBOntologyRepository;
import org.hypergraphdb.app.owl.test.OntologyContext;
import org.hypergraphdb.app.owl.versioning.VersionManager;
import org.hypergraphdb.app.owl.versioning.VersionedOntology;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyManager;

public class TestContext implements OntologyContext
{
	public HyperGraph graph;
	public HGDBOntologyManager m;
	public HGDBOntologyRepository r;
	public OWLDataFactory df;
	public VersionManager vr;
	public HGDBOntology o;
	public VersionedOntology vo;
	
	public HyperGraph graph() { return graph; }
	public OWLOntology ontology() { return o; }
	public VersionedOntology vonto() { return vo; }
	public OWLOntologyManager manager() { return o.getOWLOntologyManager(); }
	public OWLDataFactory df() { return df; }
	public HGDBOntologyRepository repo() { return r; }
	public VersionManager vrepo() { return vr; }
}
